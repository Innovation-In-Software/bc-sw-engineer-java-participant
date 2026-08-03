# Module 42 — Acronym Cheatsheet

**Topic:** Kubernetes (k3s) Deployment  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **30** curriculum slide diagram title(s) plus slide text for this module._

---

## Containers & Kubernetes

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **ConfigMap** | — | K8s object for non-secret configuration data. |
| **Control Plane** | — | K8s brain: API server, scheduler, controllers. |
| **Deployment** | — | K8s object that manages replica Pods and rolling updates. |
| **Ingress** | — | HTTP routing into cluster Services. |
| **k3s** | — | Lightweight Kubernetes distribution used in this course. |
| **K8s** | Kubernetes | Orchestrates containers: schedule, scale, heal, network. |
| **kubectl** | — | CLI to talk to a Kubernetes cluster. |
| **Kubernetes** | — | Container orchestration platform (often abbreviated K8s). |
| **Namespace** | — | Logical cluster partition for isolating resources. |
| **OpenShift** | Red Hat OpenShift | Enterprise Kubernetes platform with extra security/ops features. |
| **Pod** | — | Smallest deployable unit in Kubernetes (one or more containers). |
| **ReplicaSet** | — | Keeps a set number of identical Pods running. |
| **Rolling Update** | — | Replace Pods gradually with a new version. |
| **Secret** | Kubernetes Secret | K8s object for sensitive config (still base64-encoded). |
| **Service** | Kubernetes Service | Stable network endpoint in front of Pods. |
| **Worker Node** | — | Machine that runs application Pods. |

---

## Resilience

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **HA** | High Availability | Design so the system stays up despite failures. |

---

## Cluster Access & Manifests

| Acronym | Full form | Simple meaning |
| --- | --- | --- |
| **API** | Application Programming Interface | How clients (kubectl, UI, CI/CD) talk to the cluster; the API Server is the single front door. |
| **CLI** | Command Line Interface | How kubectl and `oc` reach the API Server (vs. a UI). |
| **UI** | User Interface | A dashboard/web client alternative to kubectl for talking to the API Server. |
| **YAML** | YAML Ain't Markup Language | The manifest format used to declare desired state (Deployments, Services, ConfigMaps...). |
| **UID** | User ID | Numeric non-root user a container runs as (`runAsUser`); Lab 42 references UID 10001. |

---

## Networking & Traffic

| Acronym | Full form | Simple meaning |
| --- | --- | --- |
| **DNS** | Domain Name System | How a Service gets a stable, discoverable name inside the cluster. |
| **IP** | Internet Protocol | Network address; Pod IPs are ephemeral, a Service's ClusterIP is stable. |
| **TLS** | Transport Layer Security | Encrypts traffic; terminated at the edge (Ingress/Route) in Lab 42. |
| **HTTP / HTTPS** | Hypertext Transfer Protocol (Secure) | What Ingress routes and readiness/liveness `httpGet` probes check; plain HTTP is redirected to HTTPS at the edge. |
| **URL** | Uniform Resource Locator | E.g. `CRM_DB_URL` -- the database connection address stored in the ConfigMap. |
| **URI** | Uniform Resource Identifier | The JWT issuer URI -- a public, non-secret OAuth/OIDC discovery value. |

---

## Auth, Security & Access Control

| Acronym | Full form | Simple meaning |
| --- | --- | --- |
| **RBAC** | Role-Based Access Control | Rules controlling who can create/read cluster objects, especially Secrets. |
| **JWT** | JSON Web Token | Compact auth token; only its issuer URI is safe to expose, never the signing key. |
| **OAuth** | Open Authorization | Delegated-login standard behind OpenShift's built-in OAuth and the JWT issuer. |
| **OIDC** | OpenID Connect | Identity layer on OAuth defining the issuer/discovery contract the JWT issuer URI is part of. |
| **SCC** | Security Context Constraints | OpenShift's stricter pod-security policy layer, on top of plain Kubernetes RBAC. |
| **SSH** | Secure Shell | One of the built-in Secret types (`kubernetes.io/ssh-auth`) for private keys. |

---

## Scaling & Resources

| Acronym | Full form | Simple meaning |
| --- | --- | --- |
| **HPA** | HorizontalPodAutoscaler | Automatically adjusts the number of Pod replicas based on metrics (e.g. 70% CPU). |
| **VPA** | Vertical Pod Autoscaler | Automatically adjusts CPU/memory requests and limits of existing Pods, no replica change. |
| **CPU** | Central Processing Unit | Compute resource set in `resources.requests/limits` and scaled on by the HPA. |

---

## OpenShift Ecosystem

| Acronym | Full form | Simple meaning |
| --- | --- | --- |
| **OLM** | Operator Lifecycle Manager | Built into OpenShift to install/manage operators (k3s uses Helm instead). |
| **S2I** | Source-to-Image | OpenShift BuildConfig strategy that builds an image straight from source, no Dockerfile needed. |

---

## Cloud-Native & Deployment Context

| Acronym | Full form | Simple meaning |
| --- | --- | --- |
| **CNCF** | Cloud Native Computing Foundation | Certifies conformant Kubernetes distributions -- k3s is CNCF certified. |
| **CI/CD** | Continuous Integration / Continuous Deployment | Automated build-and-deploy pipeline; Module 43 automates this same deployment via GitHub Actions. |
| **IoT** | Internet of Things | One of the small-footprint edge environments k3s targets. |
| **POC** | Proof of Concept | Typical use for OpenShift Local (single-node): dev, learning, demos, POCs. |
| **IaaS** | Infrastructure as a Service | OpenShift deployment model where you manage your own VMs, storage, and network. |
| **VM** | Virtual Machine | A virtualized server k3s/OpenShift can run on, vs. bare metal or managed cloud nodes. |
| **QA** | Quality Assurance | Example OpenShift Project purpose (`qa-team`: testing & QA) in the multi-tenancy table. |

---

## Domain / Lab Context

| Acronym | Full form | Simple meaning |
| --- | --- | --- |
| **CRM** | Customer Relationship Management | The crm-api application this module deploys, exposes, scales, and rolls back. |
| **DB** | Database | Shorthand in config keys like `CRM_DB_URL`, `CRM_DB_USERNAME`, `CRM_DB_PASSWORD`. |

---

## One-line memory aid

> Focus first on: **Kubernetes** · **K8s** · **k3s** · **OpenShift** · **Pod**.

---

**Related:** [Module 42 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
