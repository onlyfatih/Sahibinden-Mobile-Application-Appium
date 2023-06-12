@sahibinden
Feature:Vasıta Arama Filtreleri
  Uygulamada vasıta aramak için filtreleme yapabilme özelliğini test eder.
  Scenario:Sehir, Marka ve Fiyat Aralığına Göre Filtreleme
    Verilen bir vasıta türü, sehir, marka ve fiyat aralığına göre filtreleme yapılabilir.
    Kullanıcı, istediği filtreleri seçerek arama sonuçlarını daraltabilir.
      When Vasita butonuna tiklanir.
      When Filtrele butonuna tiklanir
      When Adres butonuna tiklanir ve adres secilir
      When Vasita butonuna tiklanir ve marka model secilir
      When Fiyat butonuna tiklanir ve fiyat araligi secilir
      When Sonuclari goster butonuna tiklanir
      Then Vasitalarin geldigi kontrol edilir