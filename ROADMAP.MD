# 🧭 SMARTCOMMERCE – FULL ROADMAP (30 Gün)

## 🎯 Amaç

Aşağıdaki teknolojileri **tek bir projede**, uçtan uca ve kurumsal seviyede göstermek:

- Kotlin
- Jetpack Compose
- Clean Architecture
- MVVM + MVI
- Test (Unit + UI)
- CI/CD
- Security
- AI destekli geliştirme

> Hedef: Android tarafında **enterprise-ready** bir proje ortaya koymak.

---

## 🔹 FAZ 0 – Hazırlık (Gün 0)

**Hedef:** Kurumsal proje disiplini oluşturmak

### Yapılacaklar
- GitHub repository oluştur
- `README.md` hazırla
- Branch strategy belirle
- Issue template ekle
- Pull Request template ekle

### 📁 Repository
smartcommerce-app


---

## 🔹 FAZ 1 – Temel Mimari & Altyapı (Gün 1–5)

### 📅 Gün 1 – Proje Kurulumu
- Kotlin
- Jetpack Compose
- Version Catalog (`libs.versions.toml`)
- `buildSrc`

**🎯 Çıktı:**
- Clean, scalable Gradle setup

---

### 📅 Gün 2 – Clean Architecture Setup
- `data/`
- `domain/`
- `core/`
- UseCase pattern
- Repository interface
- Dependency inversion

---

### 📅 Gün 3 – Multi-Module Yapı
- `feature-auth`
- `feature-home`
- `feature-product`
- `feature-cart`
- Dynamic feature modüller
- Navigation modül bağımsızlığı

---

### 📅 Gün 4 – Core Modüller
- `core-ui`
- `core-network`
- `core-security`
- `core-design-system`

**Teknik Detaylar:**
- Retrofit
- OkHttp
- Interceptors
- Centralized error handling

---

### 📅 Gün 5 – Navigation & App State
- Navigation Compose
- App-level state management
- Auth flow (login / logout)

---

## 🔹 FAZ 2 – UI & Jetpack Compose (Gün 6–10)

### 📅 Gün 6 – Design System
- Colors
- Typography
- Spacing
- Button, Card, TextField

```kotlin
SmartTheme { }
```

## 📅 Gün 7 – Auth Feature (MVVM)

- Login
- Register
- Token storage (`EncryptedSharedPreferences`)

---

## 📅 Gün 8 – Home & Product (MVVM)

- Product list
- `LazyColumn` kullanımı
- Paging mantığı

---

## 📅 Gün 9 – Cart Feature (MVI)

- State-heavy ekran yapısı
- Intent / State / Effect pattern
- `sealed class CartIntent`

---

## 📅 Gün 10 – Checkout Flow

- Order summary
- Input validation
- Fake payment simulation

---

## 🔹 FAZ 3 – Data, Network & Security (Gün 11–15)

### 📅 Gün 11 – Network Katmanı
- DTO → Domain mapping
- Error wrapper
- Timeout & retry mekanizmaları

---

### 📅 Gün 12 – Cache & Performance
- In-memory cache
- State optimization
- Recomposition sayısını azaltma

---

### 📅 Gün 13 – Security
- Network Security Config
- Token refresh mekanizması
- Input sanitization

---

### 📅 Gün 14 – Secure Storage
- `EncryptedSharedPreferences`
- Session management

---

### 📅 Gün 15 – Threat Modeling
- `SECURITY.md` oluşturma
- Risklerin belirlenmesi ve çözümler

---

## 🔹 FAZ 4 – Test (Gün 16–20)

### 📅 Gün 16 – Unit Test Setup
- JUnit
- MockK
- Turbine (Flow testleri)

---

### 📅 Gün 17 – Domain Testleri
- UseCase testleri
- Business logic doğrulama

---

### 📅 Gün 18 – ViewModel Testleri
- State doğrulama
- Error ve edge-case senaryoları

---

### 📅 Gün 19 – UI Test
- Compose UI Test
- Navigation testleri

---

### 📅 Gün 20 – Coverage & Refactor
- Test coverage analizi
- Gereksiz kodların temizlenmesi

---

## 🔹 FAZ 5 – CI/CD & DevOps (Gün 21–25)

### 📅 Gün 21 – GitHub Actions
- Build
- Test
- Lint

---

### 📅 Gün 22 – Release Pipeline
- APK build
- Versioning strategy

---

### 📅 Gün 23 – Git Flow
- Feature branch akışı
- Pull Request review süreci
- Commit convention

---

### 📅 Gün 24 – Automation
- Static analysis
- Fail-fast yaklaşımı

---

### 📅 Gün 25 – CI/CD Dokümantasyonu
- `CI_CD.md` oluşturma

---

## 🔹 FAZ 6 – AI Destekli Geliştirme & Dokümantasyon (Gün 26–30)

### 📅 Gün 26 – GitHub Copilot Kullanımı
- Boilerplate üretimi
- Test generation
- Refactor örnekleri

---

### 📅 Gün 27 – Gemini Kullanımı
- Architecture review
- Security review
- Test scenario üretimi

---

### 📅 Gün 28 – Prompt Engineering
- Prompt örnekleri
- `Gemini.md` oluşturma

---

### 📅 Gün 29 – README Final
- Screenshots
- Architecture diagram
- Tech stack

---

### 📅 Gün 30 – CV & Mülakat Hazırlığı
- CV için proje açıklaması
- Proje anlatım metni
- “Neden böyle yaptım?” sorularına hazır cevaplar

---

## 🏁 Sonuç

Bu roadmap sonunda:

- Kurumsal seviyede Android mimarisi
- Test edilebilir, güvenli ve ölçeklenebilir yapı
- CI/CD ve AI tool entegrasyonu
- Mülakatlarda güçlü şekilde anlatılabilecek bir proje

ortaya çıkarılmış olacaktır.

