# Sahibinden.com Appium Test Otomasyonu

Bu proje, sahibinden.com mobil uygulamasında vasıta arama işlemlerini otomatikleştirmek için geliştirilmiş bir test otomasyonudur. Java programlama dili ve Appium test otomasyon aracı kullanılarak yazılmıştır. Proje, IntelliJ IDEA geliştirme ortamında geliştirilmiştir.

## Özellikler

- Sahibinden.com mobil uygulamasına oturum açma
- Vasıta arama sayfasına yönlendirme
- Arama sonuçlarını ülke ve şehir seçerek filtreleme
- Marka, model ve motor gücü filtrelemesi yapma
- Fiyat aralığına göre sonuçları filtreleme
- En az ve en çok değer olarak belirtilen fiyat aralığı ve para birimini giriş yapma
- Sonuçların ekrana getirilip getirilmediğini kontrol etme

## Gereksinimler

- Java 8 veya üzeri ve coretto-1.8 SDK
- IntelliJ IDEA veya başka bir Java IDE
- Appium test otomasyon aracı
- Sahibinden.com mobil uygulaması
- Appium Server

## Kurulum

1. Bu projeyi GitHub'dan indirin veya kopyalayın.
2. IntelliJ IDEA veya tercih ettiğiniz Java IDE'de projeyi açın.
3. İlgili bağımlılıkları otomatik olarak indirecek olan Maven proje bağımlılıklarını güncelleyin.
4. Appium test ortamınızı ve Sahibinden.com mobil uygulamasını kurun.
5. Projenin içerisindeki `config.properties` dosyasını açın ve Appium ayarlarınızı yapılandırın.
6. Test senaryolarını içeren `target/test-classes/' dosyasını açın.
7. Parallel.xml'i çalıştırın

## Kullanım

1. Test senaryolarını içeren `src/test/java` klasöründe bulunan dosyaları inceleyin.
2. Her test senaryosu için ayrı ayrı parametrelerin nasıl ayarlanacağını ve hangi adımların izleneceğini anlamak için ilgili dosyaların içeriğini inceleyin.
3. Sahibinden.com mobil uygulamasında vasıta arama işlemlerini otomatikleştirmek için mevcut senaryoları temel alabilir ve gerektiğinde özelleştirebilirsiniz.

## Katkıda Bulunma

1. Bu projeyi fork edin.
2. Yeni bir dal (branch) oluşturun: `git checkout -b yeni-ozellik`
3. Değişikliklerinizi yapın ve bunları kaydedin: `git commit -am 'Yeni özellik eklendi'`
4. Dalınıza gönderin: `git push origin yeni-ozellik`
5. Bir Pull Request oluşturun.

## Lisans

Bu proje MIT Lisansı altında lisanslanmıştır. Daha fazla bilgi için [LICENSE](LICENSE) dosyasını inceleyin.

---

Bu README şablonunu kullanarak kendi proje detaylarınıza ve gereksinimlerinize göre düzenlemeler yapabilirsiniz.
