package day00_GeneralPractice;

public class C10_HarfBulmaca {
    public static void main(String[] args) {


        String siir ="Korkma! Sönmez bu şafaklarda yüzen al sancak,\n" +
                "Sönmeden yurdumun üstünde tüten en son ocak.\n" +
                "O benim milletimin yıldızıdır, parlayacak;\n" +
                "O benimdir, o benim milletimindir ancak.\n" +
                "\n" +
                "Çatma, kurban olayım, çehreni ey nazlı hilal!\n" +
                "Kahraman ırkıma bir gül; ne bu şiddet, bu celal?\n" +
                "Sana olmaz dökülen kanlarımız sonra helal…\n" +
                "Hakkıdır, Hakk’a tapan milletimin istiklal.\n" +
                "\n" +
                "Ben ezelden beridir hür yaşadım, hür yaşarım,\n" +
                "Hangi çılgın bana zincir vuracakmış? Şaşarım.\n" +
                "Kükremiş sel gibiyim, bendimi çiğner, aşarım,\n" +
                "Yırtarım dağları, enginlere sığmam, taşarım.\n" +
                "\n" +
                "Garbın afakını sarmışsa çelik zırhlı duvar,\n" +
                "Benim iman dolu göğsüm gibi serhaddim var.\n" +
                "Ulusun, korkma! Nasıl böyle bir imanı boğar,\n" +
                " “Medeniyet” dediğin tek dişi kalmış canavar?\n" +
                "\n" +
                "Arkadaş! Yurduma alçakları uğratma sakın,\n" +
                "Siper et gövdeni, dursun bu hayâsızca akın.\n" +
                "Doğacaktır sana vadettiği günler Hakk’ın,\n" +
                "Kim bilir, belki yarın belki yarından da yakın.\n" +
                "\n" +
                "Bastığın yerleri “toprak” diyerek geçme, tanı,\n" +
                "Düşün altındaki binlerce kefensiz yatanı.\n" +
                "Sen şehit oğlusun, incitme, yazıktır atanı,\n" +
                "Verme, dünyaları alsan da bu cennet vatanı.\n" +
                "\n" +
                "Kim bu cennet vatanın uğruna olmaz ki feda?\n" +
                "Şüheda fışkıracak, toprağı sıksan şüheda.\n" +
                "Canı, cananı, bütün varımı alsın da Hüda,\n" +
                "Etmesin tek vatanımdan beni dünyada cüda.\n" +
                "\n" +
                "Ruhumun senden İlahî, şudur ancak emeli:\n" +
                "Değmesin mabedimin göğsüne namahrem eli.\n" +
                "Bu ezanlar, ki şehadetleri dinin temeli,\n" +
                "Ebedî, yurdumun üstünde benim inlemeli.\n" +
                "\n" +
                "O zaman vecdile bin secde eder, varsa taşım,\n" +
                "Her cerihamdan, İlahî, boşanıp kanlı yaşım,\n" +
                "Fışkırır ruhumücerret gibi yerden naaşım,\n" +
                "O zaman yükselerek arşa değer belki başım.\n" +
                "\n" +
                "Dalgalan sen de şafaklar gibi ey şanlı hilal!\n" +
                "Olsun artık dökülen kanlarımın hepsi helal.\n" +
                "Ebediyen sana yok, ırkıma yok izmihlal.\n" +
                "Hakkıdır, hür yaşamış bayrağımın hürriyet;\n" +
                "Hakkıdır, Hakk’a tapan milletimin istiklal.";

        System.out.println(harfBul(siir, 'p'));

    }
    public static int harfBul(String siir, char harf){
        int toplamSayi = 0;
        for (int i = 0; i < siir.length(); i++) {
            if (siir.charAt(i)== harf){
                toplamSayi++;
            }

        }
        return toplamSayi;
    }
}
