# 🤖 Gemini.md
## SmartCommerce – AI Project Context & Instructions

> Bu doküman, SmartCommerce Android projesinde çalışan bir AI (Gemini) için hazırlanmıştır.  
> Amaç; projenin **mimarisini, hedeflerini, kurallarını ve beklentilerini** eksiksiz aktarmaktır.

---

## 1. 🎯 Projenin Amacı

SmartCommerce, **enterprise seviyede** tasarlanmış bir Android e-ticaret uygulamasıdır.

Bu projede aşağıdaki yetkinliklerin **tek bir codebase içinde** gösterilmesi hedeflenir:

- Kotlin
- Jetpack Compose
- Clean Architecture
- Multi-module yapı
- MVVM + MVI birlikte kullanımı
- Test edilebilir mimari
- Güvenlik (security-first yaklaşım)
- CI/CD (GitHub Actions)
- AI destekli geliştirme

> Proje bir demo değildir.  
> Gerçek hayattaki kurumsal Android projeleri **referans alınarak** geliştirilir.

---

## 2. 🧠 Ürün & İş Senaryosu

SmartCommerce:
- Birden fazla markaya hizmet veren
- Yüksek trafik varsayımı olan
- Mobil odaklı bir satış platformudur

### Kullanıcı Senaryosu
- Kullanıcı ürünleri listeler
- Ürün detaylarını inceler
- Sepete ekler
- Kampanya ve indirimleri görür
- Sipariş oluşturur

### Admin Senaryosu (Mock)
- Ürün yönetimi
- Kampanya yönetimi
- Fiyat / stok güncellemeleri

> Gerçek backend ve ödeme sistemleri **yoktur**.  
> Tüm servisler **mock / fake** olarak simüle edilir.

---

## 3. 🏗️ Mimari Kurallar (Kritik)

### 3.1 Clean Architecture

Katmanlar:
- `domain` → saf iş kuralları
- `data` → repository implementasyonları
- `core` → ortak altyapı
- `feature-*` → UI + presentation katmanı

**Kurallar:**
- Domain, Android framework bilmez
- UI → Domain’a bağımlıdır, tersi asla
- Dependency inversion zorunludur

---

### 3.2 Multi-Module Yapı

```text
app/
├── core/
│   ├── ui
│   ├── design-system
│   ├── network
│   ├── security
│   └── common
│
├── feature-auth
├── feature-home
├── feature-product
├── feature-cart
├── feature-checkout
├── feature-profile
│
├── data
├── domain
└── buildSrc
```

## 3. 📐 Modülerlik & Bağımlılık Kuralları

- Feature modülleri birbirini **direkt çağırmaz**
- Navigation **modül bağımsızdır**
- Ortak ve paylaşılan kodlar `core` altında yer alır

---

## 4. 🧩 Presentation Pattern Kuralları

### 4.1 MVVM

**Kullanım Alanları:**
- Auth
- Home
- Product
- Profile

**Kurallar:**
- ViewModel **state odaklıdır**
- UI katmanı **stateless** olmalıdır

---

### 4.2 MVI

**Kullanım Alanları:**
- Cart
- Checkout

**Kurallar:**
- Tek state kaynağı (Single Source of Truth)
- Immutable state
- Akış: `Intent → Reducer → State`

**Örnek:**
```kotlin
sealed class CartIntent
data class CartState(...)


## 5. 🎨 UI & Jetpack Compose

- Tüm UI **Jetpack Compose** ile geliştirilir
- XML **kullanılmaz**
- Design System kullanımı **zorunludur**

### Design System İçeriği
- Color palette
- Typography
- Spacing
- Reusable components

```kotlin
SmartTheme {
    // UI
}

## 6. 🔐 Güvenlik Kuralları (Security-First)

Uygulanması **zorunlu** maddeler:

- EncryptedSharedPreferences
- Token bazlı authentication
- Secure API çağrıları
- Network Security Config
- Input validation & sanitization

> Güvenlik, “sonradan eklenen” bir özellik değil,  
> **uygulama tasarımının ayrılmaz bir parçasıdır.**

---

## 7. 🌐 Network & Data Kuralları

- Retrofit + OkHttp kullanılır
- Interceptor ile:
  - Authentication
  - Logging (**sadece debug build’lerde**)

### Kurallar
- DTO → Domain mapping **zorunludur**
- UI katmanı **DTO görmez**

---

## 8. ⚡ Performans & State Yönetimi

- Gereksiz recomposition’lar **önlenmelidir**
- State **minimal** tutulmalıdır
- In-memory cache kullanılabilir
- `Flow` / `StateFlow` tercih edilir

---

## 9. 🧪 Test Kuralları (Çok Kritik)

### Unit Test
- UseCase testleri
- Repository testleri
- ViewModel testleri

### UI Test
- Compose UI Test
- Navigation senaryoları

### Kurallar
- Business logic test edilmeden **merge yapılamaz**
- Fake / Mock bağımlılıklar tercih edilir

---

## 10. ⚙️ CI/CD Beklentileri

- GitHub Actions kullanılır
- Pipeline adımları:
  - Build
  - Test
  - Lint
  - APK üretimi

> Pipeline fail olursa PR **merge edilmez**.

---

## 11. 🗂️ Git & Kod Standartları

- Feature branch akışı
- Pull Request template **zorunludur**
- Conventional commit formatı kullanılır

**Örnek:**
```text
feat(cart): add mvi state handling

## 12. 🤖 AI ile Çalışma Kuralları

### Gemini’den Beklenenler
- Kod üretirken mevcut mimariyi **bozmamak**
- Gereksiz abstraction **eklememek**
- Her feature için test yaklaşımını **önceden düşünmek**
- Security-first yaklaşımını **benimsemek**
- Açık, okunabilir ve **maintainable** kod üretmek

### Gemini için Temel İlkeler
- “Hızlı çalışan ama kötü kod” **üretilmemelidir**
- Kurumsal standartlar **her zaman önceliklendirilmelidir**

---

## 13. 📚 Zorunlu Dokümantasyonlar

Repository içinde aşağıdaki dosyalar **bulunmak zorundadır**:

- `README.md`
- `PRD.md`
- `ARCHITECTURE.md`
- `SECURITY.md`
- `CI_CD.md`
- `TESTING.md`
- `Gemini.md` (bu dosya)

---

## 14. 🚫 Kapsam Dışı

- Gerçek ödeme entegrasyonu
- Gerçek backend
- Gerçek kullanıcı verisi

> Tüm bu alanlar mock / fake servisler ile simüle edilir.

---

## 15. 🏁 Son Talimat

Gemini, bu projede:

- Bir **senior Android engineer** gibi düşünmelidir
- Kurumsal kod standartlarını **gözetmelidir**
- Test, güvenlik ve mimariyi **önceliklendirmelidir**
- Tüm kararlarını **açıklanabilir ve gerekçeli** şekilde vermelidir

