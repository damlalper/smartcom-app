# 📄 Product Requirements Document (PRD)
## SmartCommerce – Enterprise E-Commerce Android Application

---

## 1. 📌 Ürün Tanımı

**SmartCommerce**, birden fazla markaya hizmet veren, yüksek trafikli, güvenli ve ölçeklenebilir bir **kurumsal e-ticaret Android uygulamasıdır**.

Uygulama; modern Android mimarileri, modüler yapı ve test edilebilirlik esas alınarak geliştirilmiştir.  
Hedef; gerçek hayatta enterprise ekiplerin geliştirdiği sistemlere **birebir yakın** bir örnek sunmaktır.

---

## 2. 🎯 Ürün Amaçları

- Yüksek trafik altında stabil çalışan bir mobil e-ticaret deneyimi sunmak
- Modüler ve sürdürülebilir mimari ile uzun vadeli geliştirmeye uygun yapı kurmak
- Güvenlik, test ve CI/CD süreçlerini ürünün doğal bir parçası haline getirmek
- Kurumsal ölçekte Android geliştirme pratiğini göstermek

---

## 3. 👥 Hedef Kullanıcılar

### 3.1 Son Kullanıcı (Customer)
- Ürünleri inceleyen
- Kampanyaları takip eden
- Sepet ve ödeme işlemleri yapan kullanıcılar

### 3.2 Yönetici (Admin – Mock Backend)
- Ürün yönetimi
- Kampanya / indirim yönetimi
- Stok ve fiyat güncellemeleri

> Admin tarafı backend simülasyonu (mock servisler) ile temsil edilir.

---

## 4. 🧠 Ürün Senaryosu (High-Level)

1. Kullanıcı uygulamayı açar
2. Ana sayfada:
   - Kampanyalar
   - Öne çıkan ürünler
3. Kullanıcı:
   - Ürün detaylarını inceler
   - Ürünü sepete ekler
4. Sepet ekranında:
   - Ürün adetlerini düzenler
   - Toplam tutarı görür
5. Checkout:
   - Sipariş onayı
6. Profil:
   - Kullanıcı bilgileri
   - Sipariş geçmişi

---

## 5. 🧩 Fonksiyonel Gereksinimler

### 5.1 Kimlik Doğrulama (Auth)
- Kullanıcı giriş / çıkış
- Token bazlı oturum yönetimi
- Secure token saklama

### 5.2 Ürün Yönetimi
- Ürün listeleme
- Ürün detay görüntüleme
- Marka bazlı filtreleme

### 5.3 Sepet (Cart)
- Ürün ekleme / çıkarma
- Adet güncelleme
- Anlık fiyat hesaplama

### 5.4 Kampanya & İndirimler
- Kampanya listeleme
- Sepete otomatik indirim uygulama
- Kampanya koşullarının kontrolü

### 5.5 Checkout
- Sipariş özeti
- Sipariş onayı
- Hata ve loading state yönetimi

### 5.6 Profil
- Kullanıcı bilgileri
- Sipariş geçmişi (mock)

---

## 6. ⚙️ Non-Functional Gereksinimler

### 6.1 Performans
- Yüksek trafik varsayımı
- Asenkron işlemler
- State-driven UI

### 6.2 Güvenlik
- EncryptedSharedPreferences
- Secure API iletişimi
- Network Security Config
- Input validation

### 6.3 Ölçeklenebilirlik
- Multi-module yapı
- Feature bazlı modüller
- Clean Architecture katmanları

### 6.4 Test Edilebilirlik
- Unit test zorunluluğu
- UI test coverage
- Mock / Fake bağımlılıklar

---

## 7. 🏗️ Teknik Gereksinimler

### 7.1 Mimari
- Clean Architecture
- MVVM + MVI birlikte kullanım
- SOLID prensipleri

### 7.2 UI
- %100 Jetpack Compose
- Design System
- Dark / Light tema

### 7.3 State Management
- MVVM → standart ekranlar
- MVI → state-heavy ekranlar (Cart, Checkout)

---

## 8. 🧪 Test Stratejisi

### Unit Test
- ViewModel
- UseCase
- Repository

### UI Test
- Compose UI testleri
- Navigation senaryoları

Başarı kriteri:
- Kritik business logic %100 test edilebilir olmalı

---

## 9. 🚀 CI / CD Gereksinimleri

- GitHub Actions
- Otomatik:
  - Build
  - Test
  - Lint
  - APK üretimi

Pipeline başarısız olursa merge engellenir.

---

## 10. 🤖 AI Destekli Geliştirme

- GitHub Copilot
- Cursor
- Prompt örnekleri dokümante edilir

Amaç:
> AI araçlarını bilinçli ve kontrollü kullanabilme yeteneğini göstermek

---

## 11. 📚 Dokümantasyon Gereksinimleri

Zorunlu dökümanlar:
- ARCHITECTURE.md
- SECURITY.md
- CI_CD.md
- TESTING.md
- PRD.md (bu dosya)

---

## 12. 🗂️ Git & Süreç Standartları

- Feature branch akışı
- Pull Request template
- Conventional commit formatı

Örnek:
```text
feat(cart): add mvi state handling
```

## 13. ✅ Başarı Kriterleri

- Modüler ve okunabilir kod tabanı
- Test edilebilir mimari
- Güvenlik önlemlerinin eksiksiz uygulanması
- CI/CD pipeline’ın sorunsuz çalışması
- Kurumsal seviyede teknik dokümantasyon

---

## 14. 📌 Kapsam Dışı

Aşağıdaki maddeler bu projenin kapsamı dışındadır:

- Gerçek ödeme entegrasyonu
- Gerçek backend servisleri
- Gerçek kullanıcı verisi

> Bu unsurlar, mock servisler ve sahte veriler ile simüle edilir.

---

## 15. 🔚 Sonuç

SmartCommerce PRD’si, gerçek dünyadaki kurumsal e-ticaret projelerinin:

- Teknik
- Operasyonel
- Mimari

gereksinimlerini yansıtacak şekilde hazırlanmıştır.
