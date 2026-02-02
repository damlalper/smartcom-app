
---

## 🧑‍💻 1️⃣ Yazılım Geliştirme (.Net) Birimi Kapsamı

### .Net ile geliştirilecek servisler:

#### 🔹 Workflow Management Service (.Net Core)

- C# + .Net Core
- Kurumsal iş akışları:
  - Onay süreçleri
  - Ticket yönetimi
  - SLA süreleri
  - State Machine mantığı
- Örnek Akış: Talep Oluşturuldu → Onaylandı → İşleme Alındı → Tamamlandı

#### 🔹 Auth & Role Service

- JWT / OAuth
- Rol bazlı yetkilendirme:
  - Admin
  - Developer
  - Ops
- Kurumsal güvenlik mantığı

#### 🔹 RESTful API

- Controller → Service → Repository pattern
- Clean Architecture
- Logging & exception handling

📌 İlanda birebir geçenler:

✅ .Net Core  
✅ C#  
✅ Web tabanlı uygulamalar  
✅ Ölçeklenebilir yapı  
✅ Güvenilir servisler  

---

## 🐍 2️⃣ Yazılım Geliştirme (Python) Birimi Kapsamı

Python tarafı akıllı ve otomasyon ağırlıklı

#### 🔹 Automation & Rule Engine (FastAPI)

- Python + FastAPI
- Kurallar:
  - “Eğer X servisinde 5 dk içinde 3 hata varsa → Incident aç”
  - “SLA aşıldıysa → yöneticiyi bilgilendir”

#### 🔹 Event-Driven Mimari

- RabbitMQ
- Olay türleri:
  - IncidentCreated
  - ServiceDown
  - WorkflowTimeout

#### 🔹 Async & Parallel Programming

- Async endpoints
- Background workers
- Task queue mantığı

#### 🔹 Elasticsearch / ELK

- Log’ların indexlenmesi
- Hata trend analizi
- Servis bazlı performans raporları

📌 İlanda birebir geçenler:

✅ Python  
✅ FastAPI / Flask  
✅ PostgreSQL  
✅ Elasticsearch / ELK  
✅ RabbitMQ  
✅ REST  
✅ Event-driven  
✅ Asenkron programlama  
✅ AI destekli agent mantığı  

---

## ☁️ 3️⃣ Cloud & Platform Yönetimi Birimi Kapsamı

Bu proje Cloud ekibi olmadan ayakta duramaz

#### 🔹 Cloud Architecture

- GCP / Azure / AWS (birini seç, mimari anlat)
- Microservice deployment
- Compute: VM / Container
- Database: Managed PostgreSQL
- Network: VPC
- Load Balancer
- Security: Firewall, IAM

#### 🔹 CI/CD

- GitHub Actions
- Pipeline: Commit → Test → Build → Dockerize → Deploy

#### 🔹 Monitoring

- Service health checks
- Log aggregation
- Incident tetikleme

📌 İlanda birebir geçenler:

✅ Public Cloud  
✅ Mikroservis mimarisi  
✅ Compute / DB / Network  
✅ Güvenlik  
✅ DevOps  
✅ On-prem / cloud farkındalığı  

---

## 🤖 AI Destekli Kısım (ÇOK KRİTİK – seni ayırır)

#### 🔹 Incident Intelligence Agent (Python)

- Log’ları okur
- Benzer hataları gruplar
- “Bu hata daha önce nerede olmuş?” sorusunu cevaplar
- Basit LLM veya rule-based yaklaşım yeterli

➡️ İlanda geçen:

> “yapay zekâ destekli agent’ları yazılım geliştirme süreçlerinde etkin kullanan”

---

## 📂 GitHub Repo Yapısı
ue-wimp/
│
├── backend-dotnet/
│ ├── WorkflowService
│ ├── AuthService
│
├── backend-python/
│ ├── automation-engine
│ ├── incident-agent
│
├── infra/
│ ├── terraform
│ ├── docker-compose
│
├── docs/
│ ├── architecture.md
│ ├── api-spec.md
│
└── README.md


---

## PRD – Unified Enterprise Workflow & Incident Management Platform

### 1. Proje Özeti

Amaç: Kurumsal iş süreçleri ve incident yönetimini otomatikleştirerek, hataları hızlı tespit eden, workflow’ları yöneten ve operasyonel verimliliği artıran uçtan uca platform geliştirmek.  

Kapsam: İş süreçleri yönetimi, incident yönetimi, log analizi, AI destekli öneri, cloud deploy, mikroservisler, CI/CD pipeline.  

Hedef Kullanıcılar: Kurumsal ekipler, IT operasyon, yazılım geliştirme, yönetim ve iş birimleri.  

---

### 2. Hedefler

- SLA ve iş akışlarını takip etmek.  
- Hataları / servis downtime’ları gerçek zamanlı raporlamak.  
- Incident yönetimi ve root cause analizini kolaylaştırmak.  
- Cloud tabanlı, ölçeklenebilir ve güvenli altyapı sağlamak.  
- AI destekli önerilerle operasyonel aksiyonları hızlandırmak.  

---

### 3. Kullanıcı Hikayeleri

#### 3.1 İş Süreçleri Yöneticisi

- Workflow oluşturabilmek, onay akışları tanımlayabilmek.  
- SLA sürelerini ve iş akışının durumunu görebilmek.  
- Incident tetiklenince bildirim almak.  

#### 3.2 Yazılım Geliştirici

- API üzerinden workflow’a veri gönderebilmek.  
- Incident loglarını inceleyebilmek.  
- AI agent önerilerini görüntüleyebilmek.  

#### 3.3 IT Operasyon

- Servislerin durumunu real-time takip edebilmek.  
- RabbitMQ event’lerini izleyebilmek.  
- Cloud kaynak kullanımını ve güvenliğini yönetebilmek.  

#### 3.4 Yönetici / Admin

- Kullanıcı rolleri ve yetkileri yönetebilmek.  
- Sistemin genel performans raporlarını alabilmek.  
- Sistem ayarlarını ve CI/CD pipeline durumunu takip edebilmek.  

---

### 4. Fonksiyonel Gereksinimler

#### 4.1 Workflow Management

- İş akışları oluşturma, düzenleme ve silme.  
- SLA tanımlama ve takip.  
- Onay mekanizmaları (multi-level approval).  
- REST API üzerinden CRUD işlemleri.  

#### 4.2 Incident Management

- Hataları, servis downtime’larını otomatik tespit etme.  
- RabbitMQ üzerinden event-driven incident tetikleme.  
- Incident durumları: New, In Progress, Resolved, Closed.  
- AI agent önerileri ile önceliklendirme.  

#### 4.3 Automation & Rule Engine

- Python tabanlı kural motoru (FastAPI).  
- Örnek kurallar:  
  - “Eğer X serviste 5 dk içinde 3 hata → Incident aç”  
  - “SLA aşıldıysa → yöneticiyi bilgilendir”  
- Asenkron ve paralel işlem desteği (async / Celery / Background Tasks).  

#### 4.4 Data & Logging

- PostgreSQL: kalıcı veri ve workflow bilgisi.  
- Elasticsearch / ELK Stack: log ve incident analizi.  
- Veriler güvenli şekilde saklanmalı, audit logları tutulmalı.  

#### 4.5 Authentication & Authorization

- JWT / OAuth tabanlı kimlik doğrulama.  
- Rol bazlı yetkilendirme: Admin, Developer, Ops  
- Kullanıcı yönetimi arayüzü.  

#### 4.6 API & Integration

- RESTful API’ler: workflow, incident, user management.  
- Event-driven servisler: RabbitMQ.  
- Cloud servisleri ile entegrasyon: GCP / Azure / AWS.  

---

### 5. Teknik Gereksinimler

| Alan | Teknoloji / Araç |
|------|----------------|
| Backend (.NET) | C#, .NET Core, REST API, Entity Framework |
| Backend (Python) | Python 3.10+, FastAPI, AsyncIO, Celery, RabbitMQ |
| Database | PostgreSQL |
| Logging | Elasticsearch, Kibana |
| Containerization | Docker, Docker Compose |
| Cloud | GCP / Azure / AWS (Compute, DB, Network, Security) |
| CI/CD | GitHub Actions / GitLab CI, Docker Registry, Terraform |
| Authentication | JWT / OAuth2, Role-based Access Control |

---

### 6. Mimari Detaylar

#### 6.1 Mikroservisler

- Workflow Service (.NET Core): iş akışları, SLA, approval yönetimi.  
- Incident Service (Python): event-driven incident tetikleme, AI agent önerileri.  
- Auth Service (.NET Core): kimlik doğrulama, rol yönetimi.  
- Automation Service (Python): kural motoru, async task execution.  

#### 6.2 Event-driven Yapı

- RabbitMQ üzerinden tüm servisler arasında event publish/subscribe yapılır.  
- Event tipleri: WorkflowCreated, IncidentCreated, IncidentResolved, ServiceDown.  

#### 6.3 Cloud & DevOps

- Mikroservisler containerize edilecek.  
- Terraform ile cloud altyapısı oluşturulacak (VPC, DB, Compute, Load Balancer).  
- CI/CD pipeline: Commit → Test → Build → Docker → Deploy → Monitor.  
- Monitoring: servis health check, log aggregation, incident alerting.  

---

### 7. Veri Yapıları (Örnek)

#### Workflow

```json
{
  "id": "uuid",
  "name": "Invoice Approval",
  "status": "InProgress",
  "sla_deadline": "2026-02-10T12:00:00Z",
  "steps": [
    {"step_id": 1, "role": "Manager", "status": "Approved"},
    {"step_id": 2, "role": "Finance", "status": "Pending"}
  ]
}
Incident
{
  "id": "uuid",
  "workflow_id": "uuid",
  "type": "ServiceDown",
  "severity": "High",
  "status": "New",
  "created_at": "2026-02-02T08:30:00Z",
  "resolved_at": null,
  "assigned_to": "ops_user_01"
}

8. Kullanıcı Arayüzü

Web dashboard (React veya Blazor)

Görev listesi, workflow durumu, incident listesi

SLA ve performans göstergeleri (grafik ve tablo)

Rol bazlı görünüm (Admin / Developer / Ops)

9. Yapay Zeka / Analitik

AI agent Python tabanlı: incident pattern detection, öneri ve önceliklendirme.

Log ve incident verilerini geçmişe dayalı analiz.

Öneri örneği: “Bu hatanın olası sebebi X serviste timeout, müdahale önerisi: restart service.”

10. Güvenlik ve Uyumluluk

Tüm API endpoint’leri HTTPS üzerinden.

JWT token ve OAuth2 ile erişim kontrolü.

Audit log: workflow, incident, user activity kaydı.

Cloud güvenlik: firewall, IAM, network policies.

11. Başarı Kriterleri

Tüm workflow ve incident’ların REST API üzerinden yönetilebilir olması.

RabbitMQ event’lerinin doğru şekilde publish/subscribe edilmesi.

AI agent önerilerinin doğru ve kullanılabilir olması.

Cloud ortamında deploy ve scaling sorunsuz çalışmalı.

Kullanıcı rolleri ve yetkilendirme eksiksiz olmalı.

12. MVP & Gelecek

MVP: Workflow CRUD, incident yönetimi, temel AI agent önerisi, Docker + cloud deploy.

Gelişmiş versiyon: Multi-cloud, gelişmiş AI pattern detection, predictive SLA, mobil uygulama.

