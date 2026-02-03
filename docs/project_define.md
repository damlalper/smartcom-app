# 🛒 SmartCommerce

**Modüler, ölçeklenebilir, güvenli ve yüksek trafikli bir e-ticaret Android uygulaması**

Ama sıradan bir e-ticaret değil.  
Bu proje **kurumsal / enterprise seviye** düşünülerek tasarlanmıştır.

---

## 🚀 Proje Özeti

SmartCommerce, birden fazla markaya hizmet veren, yüksek trafik altında çalışması hedeflenen kurumsal bir satış platformudur.

### Temel Hedefler
- Büyük ölçekli mimari
- Yüksek performans
- Güvenlik odaklı geliştirme
- Test edilebilir ve sürdürülebilir kod yapısı

---

## 🧠 Ürün Senaryosu (Gerçek Hayat)

Kurumsal satış platformu senaryosu:

- Kullanıcılar ürünleri listeler ve inceler
- Ürünleri sepete ekler
- Sipariş oluşturur
- Kampanya ve indirimleri görüntüler
- Admin tarafı (mock backend) üzerinden:
  - Ürün yönetimi
  - Kampanya yönetimi

> Yüksek trafik varsayımıyla **performans** ve **güvenlik** ön plandadır.  
> Bu senaryo, ilandaki *“yüksek trafikli e-ticaret”* gereksinimini birebir karşılar.

---

## 🏗️ Mimari Yapı

### 📐 Clean Architecture + Multi-Module

```text
app/
│
├── core/
│   ├── ui
│   ├── design-system
│   ├── security
│   ├── network
│   └── common
│
├── feature-auth/
├── feature-home/
├── feature-product/
├── feature-cart/
├── feature-checkout/
├── feature-profile/
│
├── data/
├── domain/
└── buildSrc/
```

Sağlanan Kazanımlar
✔ Clean Architecture

✔ SOLID prensipleri

✔ Büyük ölçekli modüler yapı

✔ Gerçek projeye yakın multi-module deneyimi

🧩 MVVM + MVI Kullanımı
MVVM → Standart ekranlar

MVI → State-heavy ekranlar (Cart, Checkout)

Örnek State Yapısı
data class CartState(
    val items: List<CartItem>,
    val isLoading: Boolean,
    val error: String?
)
✔ MVVM
✔ MVI
✔ State management bilgisi

🎨 UI – Jetpack Compose (İleri Seviye)
%100 Jetpack Compose

Custom Design System

Dark / Light tema desteği

Reusable UI bileşenleri

Örnek Component
@Composable
fun PrimaryButton(
    text: String,
    onClick: () -> Unit
)
✔ Advanced Compose
✔ Sürdürülebilir UI mimarisi
✔ Kurumsal tasarım yaklaşımı

🔐 Güvenlik
Güvenlik, proje tasarımının merkezindedir.

Uygulanan Önlemler
EncryptedSharedPreferences

Token yönetimi

Secure API çağrıları

Input validation

Network Security Config

<network-security-config>
    <base-config cleartextTrafficPermitted="false"/>
</network-security-config>
✔ Veri güvenliği
✔ Secure coding practices

🧪 Test Stratejisi
Unit Test
ViewModel testleri

UseCase testleri

Repository testleri

UI Test
Compose UI testleri

Navigation testleri

@Test
fun addToCart_updatesState() { }
✔ Unit Test
✔ UI Test
✔ Test edilebilir mimari

⚙️ CI / CD
GitHub Actions ile otomatik süreçler:

Build

Test

Lint

APK üretimi

- name: Run Unit Tests
  run: ./gradlew test
✔ CI/CD bilgisi
✔ DevOps farkındalığı

🤖 AI Destekli Geliştirme
Repo içerisinde dokümante edilmiştir:

GitHub Copilot kullanımı

Cursor ile refactor örnekleri

Prompt örnekleri (README)

✔ AI araçlarını etkin kullanabilme
✔ Modern geliştirme yaklaşımı

📚 Teknik Dokümantasyon
Repository içinde:

ARCHITECTURE.md

SECURITY.md

CI_CD.md

TESTING.md

✔ Dokümantasyon alışkanlığı
✔ Kurumsal disiplin

🗂️ Git Akışı
Feature branch yapısı

Pull Request template

Commit message standardı

feat(cart): add mvi state handling
✔ Git flow
✔ Takım çalışmasına uyum

📌 Sonuç
SmartCommerce, junior – mid – senior seviyelerinde yapılan işe alımlarda:

Mimari bilgi

Ölçeklenebilirlik farkındalığı

Güvenlik bilinci

Test kültürü

CI/CD ve AI tool kullanımı

gibi kritik başlıkların tamamını tek projede göstermeyi hedefler.

