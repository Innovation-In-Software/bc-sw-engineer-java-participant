package com.northstar.crm.config;

import org.apache.kafka.common.TopicPartition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.listener.CommonErrorHandler;
import org.springframework.kafka.listener.DeadLetterPublishingRecoverer;
import org.springframework.kafka.listener.DefaultErrorHandler;
import org.springframework.util.backoff.FixedBackOff;

/**
 * Lab 46 — edit <em>this</em> Lab 31 class. Do not add a second {@code DefaultErrorHandler} {@code @Bean}.
 *
 * <p>TODO(lab46): ExponentialBackOff with max elapsed 10s (lab).
 * <p>TODO(lab46): addNotRetryableExceptions for contract errors (InvalidCustomerEventException,
 * UnsupportedEventVersionException). JsonParseException on the listener often does <em>not</em>
 * catch poison JSON (fails in the deserializer) — ErrorHandlingDeserializer is optional homework.
 * <p>TODO(lab46): Uncomment {@code kafkaListenerContainerFactory} so the handler actually runs.
 */
@Configuration
public class KafkaErrorConfig {

  public static final String DLT_SUFFIX = ".DLT";

  @Bean
  public CommonErrorHandler kafkaErrorHandler(KafkaTemplate<Object, Object> template) {
    DeadLetterPublishingRecoverer recoverer =
        new DeadLetterPublishingRecoverer(
            template,
            (record, ex) ->
                new TopicPartition(record.topic() + DLT_SUFFIX, record.partition()));

    // TODO(lab46): replace FixedBackOff with ExponentialBackOff (500ms ×2, maxElapsedTime 10_000)
    DefaultErrorHandler handler = new DefaultErrorHandler(recoverer, new FixedBackOff(500L, 2L));

    // TODO(lab46): handler.addNotRetryableExceptions(...)
    return handler;
  }

  // TODO(lab46): uncomment this bean — a handler that is never set on the factory does not run.
  // @Bean
  // public ConcurrentKafkaListenerContainerFactory<Object, Object> kafkaListenerContainerFactory(
  //     ConsumerFactory<Object, Object> consumerFactory, CommonErrorHandler kafkaErrorHandler) {
  //   ConcurrentKafkaListenerContainerFactory<Object, Object> factory =
  //       new ConcurrentKafkaListenerContainerFactory<>();
  //   factory.setConsumerFactory(consumerFactory);
  //   factory.setCommonErrorHandler(kafkaErrorHandler);
  //   factory.getContainerProperties().setAckMode(ContainerProperties.AckMode.RECORD);
  //   factory.setConcurrency(1);
  //   return factory;
  // }
}
