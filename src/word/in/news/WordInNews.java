package word.in.news;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class WordInNews {
    public static String getPage(String url) throws IOException {        
        DefaultHttpClient httpclient = new DefaultHttpClient();
        HttpGet httpget = new HttpGet(url);
        HttpResponse response = httpclient.execute(httpget);
        String status = response.getStatusLine().toString();
        BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        String line, httpText = "";
        while ((line = rd.readLine()) != null) {
            httpText += line + "\n";
        }
        if (httpText == null) return "Error ! \n" + getPage(url);
        else return httpText;
    }
    public static ArrayList<news> getNews(String data){
        
        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        String INPUT = "run:\n" +
"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
"<rss version=\"2.0\">\n" +
"   <channel>\n" +
"      <title>سایت خبری تحلیلی تابناك|اخبار ایران و جهان|TABNAK</title>\n" +
"      <link>http://www.tabnak.ir</link>\n" +
"      <description>سايت خبري تحليلي تابناك</description>\n" +
"      <managingEditor>info@tabnak.ir</managingEditor>\n" +
"      <webMaster>info@iransamaneh.com</webMaster>\n" +
"      <lastBuildDate>Sat, 06 May 2017 13:25:11 +0430</lastBuildDate>\n" +
"      <generator>SepehrFeed V1.2</generator>\n" +
"      <item>\n" +
"         <title>جریمه 110 میلیارد دلاری برای محصولات بهداشتی کودک جانسون</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691326/جریمه-110-میلیارد-دلاری-برای-محصولات-بهداشتی-کودک-جانسون</link>\n" +
"         <description>دادگاهی در ایالت سنت لوئیس و در منطقه میسوری دستور داد تا شرکت دارویی ایالات متحده آمریکا، جانسون و جانسون (J &amp; J) به دلیل ترویج سرطان تخمدان با استفاده از پودر تالک در محصولاتش، محکوم به پرداخت 110 میلیون دلار به یک زن باشد.</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 13:23:41 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>میرسلیم به نفع کسی کنار نمی رود</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691325/میرسلیم-به-نفع-کسی-کنار-نمی-رود</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 13:15:35 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>احضار پیمانکار معدن زغال سنگ آزادشهر به دادسرا</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691324/احضار-پیمانکار-معدن-زغال-سنگ-آزادشهر-به-دادسرا</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 13:13:13 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>استان کردستان/شهرستان سرواباد/روستای بیساران</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691323/استان-کردستانشهرستان-سروابادروستای-بیساران</link>\n" +
"         <description>بخش «نگاه شما» برای ارائه و معرفی «نگاه» مخاطبان «تابناک» به همه موضوعات است .هر مخاطب «تابناک» می تواند با مد نظر قرار دادن شرایط همکاری با این بخش، «نگاه» خود را به آدرس های زیر ارسال کند تا در معرض دید و داوری دیگر مخاطبان قرار گیرد. آدرس ایمیل: negaheshoma@tabnak.ir و یا آدرس تلگرام: www_tabnak_ir@</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 13:08:37 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>کارارزشمند بازیکن پرسپولیس درجنوب تهران+عکس</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691322/کارارزشمند-بازیکن-پرسپولیس-درجنوب-تهران-عکس</link>\n" +
"         <description>در این مراسم یاد و خاطره شهدای مدافع حرم گرامی داشته و یک پیراهن شماره 15 هم به انصاری تقدیم شد.</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 12:59:23 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>فردا سامانه بارشی جدید به ایران می رسد</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691321/فردا-سامانه-بارشی-جدید-به-ایران-می-رسد</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 12:59:00 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>سرمربی جدید تیم ملی هندبال انتخاب شد</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691320/سرمربی-جدید-تیم-ملی-هندبال-انتخاب-شد</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 12:57:48 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>ژست رییس فدراسیون دراجلاس قاره ای با پرچم برعکس ایران!</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691319/ژست-رییس-فدراسیون-دراجلاس-قاره-ای-با-پرچم-برعکس-ایران</link>\n" +
"         <description>اجلاس هیات رئیسه کنفدراسیون دوچرخه سواری آسیا و پرچم برعکس ایران!! کسی هم که به دوربین خیره شده است، قمری رییس فدراسیون ایران است که حتی ترتیب رنگ پرچم کشورش را هم نمی داند تا آن را اصلاح کند.</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 12:55:00 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>بایدها و نبایدهای استفاده از مسواک برقی</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691318/بایدها-و-نبایدهای-استفاده-از-مسواک-برقی</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 12:50:38 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>رییسی: رقیب خاصی در انتخابات ندارم</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691298/رییسی-رقیب-خاصی-در-انتخابات-ندارم</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 12:48:01 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>میزان رای روحانی و جهانگیری چقدر است؟</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691293/میزان-رای-روحانی-و-جهانگیری-چقدر-است</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 12:42:02 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>آخرین‌خبرهاازپیوستن شهباززاده‌ورضاییان‌به‌استقلال</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691316/آخرین‌خبرهاازپیوستن-شهباززاده‌ورضاییان‌به‌استقلال</link>\n" +
"         <description>گمانه‌زنی‌هایی مبنی بر لیست خرید این مربی مطرح و صحبت از گزینه‌هایی چون سجاد شهباززاده و رامین رضاییان شد، اما منصوریان هنوز تصمیمی برای جذب بازیکن نگرفته است</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 12:33:48 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>توهین‌های صورت گرفته در مناظره بررسی می شود</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691292/توهین‌های-صورت-گرفته-در-مناظره-بررسی-می-شود</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 12:30:02 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>بارگیری اولین محموله نفتی عراق برای مصر</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691315/بارگیری-اولین-محموله-نفتی-عراق-برای-مصر</link>\n" +
"         <description>وزارت نفت عراق اعلام کرد که اولین محموله نفتی این کشور به مقصد مصر در چارچوب توافق بین بغداد و قاهره، بارگیری شده است.</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 12:29:52 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>چرا روحانی در مناظره آرام بود؟</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691289/چرا-روحانی-در-مناظره-آرام-بود</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 12:25:01 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>شجاع خلیل زاده هم به باشگاه پرسپولیس رفت</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691314/شجاع-خلیل-زاده-هم-به-باشگاه-پرسپولیس-رفت</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 12:20:00 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>خوش و بش روحانی و رئیسی در پشت صحنه مناظره/عکس</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691312/خوش-و-بش-روحانی-و-رئیسی-در-پشت-صحنه-مناظرهعکس</link>\n" +
"         <description>در حاشیه دومین مناظره زنده نامزدهای انتخابات ریاست جمهوری.</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 12:16:38 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>کاهش اقبال به تبلت ها تثبیت شد</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691310/کاهش-اقبال-به-تبلت-ها-تثبیت-شد</link>\n" +
"         <description>میزان عرضه جهانی تبلت ها در سه ماهه اول سال 2017 هم کاهش یافت. این سی امین ماه متوالی است که شاهد کاهش اقبال به تبلت‌ها در بازارهای جهانی هستیم.</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 12:12:17 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>برخورد قطار با رمه گوسفندان در ملکان</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691311/برخورد-قطار-با-رمه-گوسفندان-در-ملکان</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 12:12:00 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>انجام آواربرداری از خرابی های اقتصاد در چهارسال</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691309/انجام-آواربرداری-از-خرابی-های-اقتصاد-در-چهارسال</link>\n" +
"         <description>عضو کمیسیون اقتصادی مجلس شورای اسلامی با بیان اینکه ایجاد اشتغال پایدار به زمان نیاز دارد، گفت:در چند سال اخیر بازار ارز در آرامش نسبی قرار گرفته که این آرامش متاثر از مولفه های اقتصادی بوده و مصنوعی نیست.</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 12:11:59 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>وزارت بهداشت میزان استاندارد سموم محصولات کشاورزی را مشخص کند</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691308/وزارت-بهداشت-میزان-استاندارد-سموم-محصولات-کشاورزی-را-مشخص-کند</link>\n" +
"         <description>سخنگوی کمیسیون بهداشت و درمان مجلس با بیان اینکه وزارت بهداشت باید میزان استاندارد سموم را مشخص و آیین نامه آن را ابلاغ کند، گفت: وزارت جهاد کشاورزی نیز موظف به اجرای این آیین نامه است.</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 12:11:16 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>شیوع گسترده وبا در سومالی</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691307/شیوع-گسترده-وبا-در-سومالی</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 12:10:45 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>نظارت‌ قابل قبول وزارت کار برایمنی محیط های کار</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691305/نظارت‌-قابل-قبول-وزارت-کار-برایمنی-محیط-های-کار</link>\n" +
"         <description>رییس کمیسیون اجتماعی مجلس، نظارت بر ایمنی محیط های کاری ازسوی وزارت کار را قابل قبول دانست و گفت: به دلیل شرایط نامناسب کاری و اشتغال، کارگران در کارگاه های ناایمن فعالیت می کنند.</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 12:10:44 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>دولت به صراحت بگوید برای مردم چه کار کرده است</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691303/دولت-به-صراحت-بگوید-برای-مردم-چه-کار-کرده-است</link>\n" +
"         <description>توافق هسته ای ایران با گروه 1+5 موسوم به برجام به اندازه ای که روی آن کار شد، بیشتر می توانست نزد اذهان عمومی مطرح شود و پیش مردم جای خود را باز کند. برجام بزرگترین دستاورد سیاسی در حوزه بین المللی نه فقط برای ایران که برای جهان در دوره اخیر است.</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 12:09:48 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>آخرین وضعیت دانشجویان مسموم در دانشگاه شیراز</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691304/آخرین-وضعیت-دانشجویان-مسموم-در-دانشگاه-شیراز</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 12:09:44 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>استقلال و پرسپولیس نمی‌توانند بازیکن خارجی جذب کنند</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691306/استقلال-و-پرسپولیس-نمی‌توانند-بازیکن-خارجی-جذب-کنند</link>\n" +
"         <description>در حال حاضر تیم‌های پرسپولیس، استقلال، تراکتورسازی، پدیده و سیاه جامگان به دلیل شکایت بازیکنان یا مربی خارجی سابق خود در فیفا پرونده دارند. با این حال امروز بنا بر اعلام منشا، این بازیکن با پرسپولیس قرارداد داخلی دو ساله منعقد کرد.</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 12:09:41 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>بازار مرغ پرتلاطم‌تر از بازار ارز/سود زحمات مرغداران به جیب دلالان می‌رود</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691301/بازار-مرغ-پرتلاطم‌تر-از-بازار-ارزسود-زحمات-مرغداران-به-جیب-دلالان-می‌رود</link>\n" +
"         <description>عضوکمیسیون کشاورزی،آب و منابع طبیعی مجلس با بیان اینکه افزایش چند برابری نرخ مرغ از تولید تا فروش در بازار مصرفی نتیجه حضور گسترده دلالان است،گفت: تحمیل فشارهای اقتصادی بر مصرف کنندگان و مرغداران نتیجه گرانی نهاده های دامی است.</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 12:07:41 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>منشا: بله، من پرسپولیسی شدم!</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691302/منشا-بله-من-پرسپولیسی-شدم</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 12:06:19 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>باغ گياه شناسي ملي ايران</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691300/باغ-گياه-شناسي-ملي-ايران</link>\n" +
"         <description>بخش «نگاه شما» برای ارائه و معرفی «نگاه» مخاطبان «تابناک» به همه موضوعات است .هر مخاطب «تابناک» می تواند با مد نظر قرار دادن شرایط همکاری با این بخش، «نگاه» خود را به آدرس های زیر ارسال کند تا در معرض دید و داوری دیگر مخاطبان قرار گیرد. آدرس ایمیل: negaheshoma@tabnak.ir و یا آدرس تلگرام: www_tabnak_ir@</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 12:05:23 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>مواضع نامزدهای ریاست جمهوری ایران نسبت به برجام در گزارش بلومبرگ</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691284/مواضع-نامزدهای-ریاست-جمهوری-ایران-نسبت-به-برجام-در-گزارش-بلومبرگ</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 12:05:01 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>سهمیه ایران در لیگ آسیا تا دوسال دیگر کم نمی شود</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691299/سهمیه-ایران-در-لیگ-آسیا-تا-دوسال-دیگر-کم-نمی-شود</link>\n" +
"         <description>سهمیه کشورها از جمله ایران در لیگ قهرمانان آسیا تا  سال 2018 تغییری نمی کند و در آن سال کمیته مسابقات و هیات رئیسه ‏AFC برای تعیین سهمیه ها در فصل 2019-2020  تصمیم گیری خواهند کرد.</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 12:04:06 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>معاون دفتر روحانی؛ منتظر مناظرۀ سوم باشید، ورق برمی‌گردد</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691282/معاون-دفتر-روحانی-منتظر-مناظرۀ-سوم-باشید-ورق-برمی‌گردد</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 11:59:01 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>آشوب در انتخابات فرانسه با هک گسترده کمپین امانوئل ماکرون / انگشت اتهام به سمت روسیه</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691296/آشوب-در-انتخابات-فرانسه-با-هک-گسترده-کمپین-امانوئل-ماکرون-انگشت-اتهام-به-سمت-روسیه</link>\n" +
"         <description>در حالی که قرار است فردا دور نهایی انتخابات فرانسه برای مشخص شدن رئیس جمهور آینده این کشور میان امانوئل ماکرون، نامزد مستقل و مارین لوپن نامزد راست افراطی برگزار شود، آشوب و آشفتگی فضای سیاسی فرانسه را در پی اعلام هک گسترده کمپین انتخاباتی امانوئل ماکرون فراگرفته است. بسیاری از دخالت روس ها در انتخابات فرانسه، برابر با فرمولی شبیه به انتخابات آمریکا سخن می گویند.</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 11:57:11 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>محرومیت علی دایی از فینال جام حذفی</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691297/محرومیت-علی-دایی-از-فینال-جام-حذفی</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 11:56:56 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>گسترش و نوسازی حمل ونقل عمومی پایتخت اولویت شورای پنجم</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691295/گسترش-و-نوسازی-حمل-ونقل-عمومی-پایتخت-اولویت-شورای-پنجم</link>\n" +
"         <description>عضو مجمع نمایندگان استان تهران ،در مجلس کاهش آلودگی هوا و ترافیک پایتخت را نیازمند گسترش، ترمیم و نوسازی حمل و نقل عمومی دانست و گفت: اولویت شورای پنجم توجه به این مهم باشد.</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 11:55:35 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>برگزاری موفقیت آمیز مانور انتخابات الکترونیکی در ۴۰ شهر</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691294/برگزاری-موفقیت-آمیز-مانور-انتخابات-الکترونیکی-در-۴۰-شهر</link>\n" +
"         <description>عضو هیات مرکزی نظارت بر انتخابات شوراهای اسلامی شهر و روستا گفت: تاکنون در۴۰ شهر مانور انتخابات الکترونیکی برگزار شده که در نظر داریم در ۱۰۰ شهر این مانور برگزار شود.</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 11:55:01 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>رویه اشتباهی که «جهانگیری» در مناظره بنیان گذاشت</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691278/رویه-اشتباهی-که-جهانگیری-در-مناظره-بنیان-گذاشت</link>\n" +
"         <description>جهانگیری اواسط مناظره صحبت منتشر نشده‌ای از رهبر معظم انقلاب نقل کرد. اگر سایر نامزدها این کار را می‌کردند چه واکنشی در پی داشت؟</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 11:50:01 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>اعلام شماره تماس پاسخگوی بازنشستگان کشوری</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691291/اعلام-شماره-تماس-پاسخگوی-بازنشستگان-کشوری</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 11:47:45 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>کمبود آهن را با خستگی اشتباه نگیرید</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691288/کمبود-آهن-را-با-خستگی-اشتباه-نگیرید</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 11:45:26 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>خیابان و بوستان دکتر شریعتی غرق لاله های بهاری</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691290/خیابان-و-بوستان-دکتر-شریعتی-غرق-لاله-های-بهاری</link>\n" +
"         <description>بخش «نگاه شما» برای ارائه و معرفی «نگاه» مخاطبان «تابناک» به همه موضوعات است .هر مخاطب «تابناک» می تواند با مد نظر قرار دادن شرایط همکاری با این بخش، «نگاه» خود را به آدرس های زیر ارسال کند تا در معرض دید و داوری دیگر مخاطبان قرار گیرد. آدرس ایمیل: negaheshoma@tabnak.ir و یا آدرس تلگرام: www_tabnak_ir@</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 11:45:09 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>كوير مرنجاب</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691287/كوير-مرنجاب</link>\n" +
"         <description>بخش «نگاه شما» برای ارائه و معرفی «نگاه» مخاطبان «تابناک» به همه موضوعات است .هر مخاطب «تابناک» می تواند با مد نظر قرار دادن شرایط همکاری با این بخش، «نگاه» خود را به آدرس های زیر ارسال کند تا در معرض دید و داوری دیگر مخاطبان قرار گیرد. آدرس ایمیل: negaheshoma@tabnak.ir و یا آدرس تلگرام: www_tabnak_ir@</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 11:41:38 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>گادوین منشا با پرسپولیس قرارداد امضا کرد</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691286/گادوین-منشا-با-پرسپولیس-قرارداد-امضا-کرد</link>\n" +
"         <description>منشا در لیگ برتر 15 گل برای پیکان به ثمر رساند و در موفقیت‌های این تیم نقش اساسی ایفا کرد. او از اواسط فصل زمزمه رفتن به پرسپولیس را سر داده بود و سرانجام به این خواسته اش رسید</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 11:41:12 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>با اتمام مناظره دوم تاکنون به چه میزان در جریان برنامه‌های کاندیداهای خود قرار گرفتید؟</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691285/با-اتمام-مناظره-دوم-تاکنون-به-چه-میزان-در-جریان-برنامه‌های-کاندیداهای-خود-قرار-گرفتید</link>\n" +
"         <description>با توجه به اینکه عمده فضای تبلیغاتی کاندیداها در رسانه ‌ملی است و نیمی از زمان تبلیغات هم گذشته، شما تا چه میزان توانستید در جریان برنامه‌های کاندیداهای خود قرار بگیرید؟ به نظر شما کدام کاندیدا موفق شده‌، فارغ از کلی‌گویی‌ها و شعارزدگی‌ها، برنامه عملی خود را برای شما تشریح کند؟ این برنامه‌ها تا چه میزان توانسته به شما کمک کند، کاندیدای مورد نظر خود را انتخاب کنید؟</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 11:40:54 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>استقبال توکلی از پیشنهاد اعلام دارایی نامزدها</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691277/استقبال-توکلی-از-پیشنهاد-اعلام-دارایی-نامزدها</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 11:40:01 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>طبيعت زيباي بهاري زاغه-لرستان</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691283/طبيعت-زيباي-بهاري-زاغه-لرستان</link>\n" +
"         <description>بخش «نگاه شما» برای ارائه و معرفی «نگاه» مخاطبان «تابناک» به همه موضوعات است .هر مخاطب «تابناک» می تواند با مد نظر قرار دادن شرایط همکاری با این بخش، «نگاه» خود را به آدرس های زیر ارسال کند تا در معرض دید و داوری دیگر مخاطبان قرار گیرد. آدرس ایمیل: negaheshoma@tabnak.ir و یا آدرس تلگرام: www_tabnak_ir@</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 11:38:59 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>رییسی: رقیب خاصی در انتخابات ندارم</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691281/رییسی-رقیب-خاصی-در-انتخابات-ندارم</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 11:36:07 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>موگرینی: آمریکا نمی‌تواند به تنهایی برجام را کنار بگذارد</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691280/موگرینی-آمریکا-نمی‌تواند-به-تنهایی-برجام-را-کنار-بگذارد</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 11:35:28 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>انتقاد از  عدم بی‌طرفی سیما</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691276/انتقاد-از-عدم-بی‌طرفی-سیما</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 11:34:01 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>پایین کشیدن و شکستن مجسمه چاوز در ونزوئلا</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691279/پایین-کشیدن-و-شکستن-مجسمه-چاوز-در-ونزوئلا</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 11:33:53 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>مردم این پسر ۸ ساله را هیولا می‌خوانند!</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691082/مردم-این-پسر-۸-ساله-را-هیولا-می‌خوانند</link>\n" +
"         <description>جدیدترین اخبار گوناگون را در «تابناک با تو» از دست ندهید. در این سایت شما هر روز گزید‌ه‌ای از آخرین اخبار پیرامون موضوعات خانواده، سلامت و بهداشت، سرگرمی و دانستنی‌ها، آشپزی، فیلم و عکس‌هایی از سراسر جهان، دکوراسیون و ... را دنبال خواهید کرد. همچنین «تابناک باتو» هر روزه آماده‌ است، مطالب ارسالی شما را نیز ـ متناسب با موضوعات نامبرده ـ‌ در سایت منتشر کند.</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 11:28:19 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>حکیمی پور:روحانی، کاندیدای اصلاح طلبان است</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691274/حکیمی-پورروحانی-کاندیدای-اصلاح-طلبان-است</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 11:27:52 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>عکس جالب ناطق نوری در گود زورخانه</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691275/عکس-جالب-ناطق-نوری-در-گود-زورخانه</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 11:26:47 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>ورود سامسونگ گلکسی S8 و +S8 به ایران</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691273/ورود-سامسونگ-گلکسی-s8-و-s8-به-ایران</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 11:22:53 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>رکوردداران دقایق حضور درلیگ برتر/امرایی در صدر</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691272/رکوردداران-دقایق-حضور-درلیگ-برترامرایی-در-صدر</link>\n" +
"         <description>حسین ماهینی، بیشترین دقایق حضور در ترکیب سرخ‌پوشان پایتخت را تجربه کرد. این در حالی است که کیوان امرایی بیشترین حضور را در لیگ شانزدهم داشت.</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 11:19:38 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>واژگونی اتوبوس دانش آموزان چهارم ابتدایی داخل کانال آب+ اسامی مصدومان</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691271/واژگونی-اتوبوس-دانش-آموزان-چهارم-ابتدایی-داخل-کانال-آب-اسامی-مصدومان</link>\n" +
"         <description>اتوبوس دانش آموزان دختر یک مدرسه حین اعزام به یک اردوی دانش آموزی واژگون شده و در داخل یک کانال آب افتاده است.</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 11:18:48 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>شایعه سازی برای مدیرعاملی نصیرزاده در لیگ برتر</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691265/شایعه-سازی-برای-مدیرعاملی-نصیرزاده-در-لیگ-برتر</link>\n" +
"         <description>جدیدترین پرده این سناریو ، خبری است که از تغییرات باشگاه متمول تبریزی به گوش می رسد و بعد از استعفای سمندر از مدیرعاملی باشگاه گسترش فولاد، خبری در کانال های تلگرامی پخش شده که می گوید هوشنگ نصیرزاده گزینه مدیرعاملی گسترش فولاد است.</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 11:17:58 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>گابریل انتقاد نتانیاهو از دیدارش با منتقدین تل آویو را رد کرد</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691269/گابریل-انتقاد-نتانیاهو-از-دیدارش-با-منتقدین-تل-آویو-را-رد-کرد</link>\n" +
"         <description>وزیر امور خارجه آلمان از دیدار اخیر خود با سازمان‌های منتقد دولت در سرزمین های اشغالی که منجر به خشم نتانیاهو و لغو دیدار برنامه ریزی شده با وی در این سفر شد دفاع کرد.</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 11:16:23 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>زخم‌های گوارشی به دنبال مصرف زیاد \"ژلوفن\"</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691270/زخم‌های-گوارشی-به-دنبال-مصرف-زیاد-ژلوفن</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 11:15:59 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>رایزنی تیلرسون و لاوروف برای کاهش خشونت‌ها در سوریه</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691268/رایزنی-تیلرسون-و-لاوروف-برای-کاهش-خشونت‌ها-در-سوریه</link>\n" +
"         <description>وزارت خارجه آمریکا از گفتگوی تلفنی وزرای خارجه آمریکا و روسیه درباره تلاش های مربوط به کاهش خشونت در سوریه خبر داده است.</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 11:14:57 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>صاعقه در سوادکوه جان یک نفر را گرفت</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691267/صاعقه-در-سوادکوه-جان-یک-نفر-را-گرفت</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 11:14:35 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>خدعه آمریکا در یک توافق هسته‌ای چگونه بحران کره شمالی را رقم زد</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691264/خدعه-آمریکا-در-یک-توافق-هسته‌ای-چگونه-بحران-کره-شمالی-را-رقم-زد</link>\n" +
"         <description>هیاهو بر سر مسائل کره شمالی و احتمال اقدام این کشور برای انجام ششمین آزمایش هسته‌ای در روزهای گذشته به تنش‌های لفظی شدید میان مقام‌های پیونگ‌یانگ ــ واشنگتن منجر شده و دو کشور را تا سرحد تهدید به حملات اتمی علیه یکدیگر پیش برده است.</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 11:13:54 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>روز سوم امداد رسانی به معدنچیان یورت</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691266/روز-سوم-امداد-رسانی-به-معدنچیان-یورت</link>\n" +
"         <description>ساعت ۱۲:۰۵ دقیقه ظهر روز چهارشنبه ‌(۱۳ اردیبهشت ماه) در معدن زغال‌سنگ آزادشهر در استان گلستان انفجاری شدید رخ داد و باعث تخریب بخشی از این معدن شد. درپی این حادثه تاکنون ۲۲ نفر فوت کردند و روند امداد رسانی به سایر محبوس شدگان در روز سوم همچنان ادامه دارد.</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 11:13:48 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>آغاز تحقیقات برخی اعضای کنگره آمریکا درباره برجام</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691263/آغاز-تحقیقات-برخی-اعضای-کنگره-آمریکا-درباره-برجام</link>\n" +
"         <description>پس از انتشار گزارشی درباره توافق تبادل زندانیان میان ایران و آمریکا، اعضای کمیته نظارت در مجلس نمایندگان این کشور اعلام کردند تحقیقات درباره ارتباط این موضوع با توافق هسته‌ای ایران را آغاز کرده است.</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 11:09:55 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>درگیری مرزی افغانستان و پاکستان</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691262/درگیری-مرزی-افغانستان-و-پاکستان</link>\n" +
"         <description>فرمانده پلیس مرزی استان «قندهار» افغانستان گفت که درگیری شدید میان ماموران مرزی پاکستان و افغانستان پس از 11 ساعت شامگاه جمعه به پایان رسید. این درگیری دست کم 15 کشته برجا گذاشته است.</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 11:04:10 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>بارش شدید باران در ۱۰ استان کشور</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691261/بارش-شدید-باران-در-۱۰-استان-کشور</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 11:02:33 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>سردار جزایری: نامزدها به مسائل نظامی ورود نکنند</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691260/سردار-جزایری-نامزدها-به-مسائل-نظامی-ورود-نکنند</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 11:01:51 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>صاعقه در مازندران با یک کشته و یک زخمی</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691259/صاعقه-در-مازندران-با-یک-کشته-و-یک-زخمی</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 11:01:11 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>نجات جان کودک ۳ ساله از چنگال گرگ در زنجان</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691258/نجات-جان-کودک-۳-ساله-از-چنگال-گرگ-در-زنجان</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 10:59:05 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>واژگونی اتوبوس حامل دانش‌آموزان در تهران</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691257/واژگونی-اتوبوس-حامل-دانش‌آموزان-در-تهران</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 10:55:34 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>معاملات فرابورس امروز ۳ دقیقه متوقف می‌شود</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691256/معاملات-فرابورس-امروز-۳-دقیقه-متوقف-می‌شود</link>\n" +
"         <description>یک مقام مسئول گفت: با پیگیری سازمان بورس دست‌اندرکاران «کشرق» تاثیرات این حادثه را بر وضعیت مالی شرکت در قالب شفاف‌سازی ارائه خواهند داد.</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 10:55:14 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>افت ارزش ۲۲ ارز بانکی</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691254/افت-ارزش-۲۲-ارز-بانکی</link>\n" +
"         <description>بانک مرکزی امروز (شنبه) ارزش برابری 39 ارز عمده را اعلام کرد که بر مبنای آن قیمت 22 ارز همچون دلار آمریکا نسبت به پنج شنبه گذشته کاهش و 14 ارز دیگر از جمله یورو و پوند انگلیس افزایش یافت ؛ سه ارز نیز تغییری نداشتند.</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 10:53:14 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>امیرمحمد چهارساله قربانی کودک آزاری</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691255/امیرمحمد-چهارساله-قربانی-کودک-آزاری</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 10:52:49 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>آخرین وضعیت لایحه قانون تجارت</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691253/آخرین-وضعیت-لایحه-قانون-تجارت</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 10:51:46 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>اختصاص 2 شعبه رسیدگی به تخلفات انتخاباتی</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691252/اختصاص-2-شعبه-رسیدگی-به-تخلفات-انتخاباتی</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 10:50:57 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>دستگیری یک سلطنت طلب در زرین شهر اصفهان</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691251/دستگیری-یک-سلطنت-طلب-در-زرین-شهر-اصفهان</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 10:48:59 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>از افزایش قیمت چای تا وضعیت بد اقتصاد</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691248/از-افزایش-قیمت-چای-تا-وضعیت-بد-اقتصاد</link>\n" +
"         <description>موضوع \"اقتصاد ایران و جهان در گذر زمان\" در این نوشتار به وقایع تاریخی شانزدهمین روز اردیبهشت ماه اختصاص دارد که به طور مستقیم و غیر مستقیم اقتصاد ایران و جهان را متاثر کرده است.</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 10:48:26 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>پیشتازی ماکرون در آخرین نظرسنجی‌ها پیش از انتخابات یکشنبه</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691249/پیشتازی-ماکرون-در-آخرین-نظرسنجی‌ها-پیش-از-انتخابات-یکشنبه</link>\n" +
"         <description>تازه ترین نظرسنجی ها نشان می‌دهد که امانوئل ماکرون نامزد مستقل و میانه رو همچنان در آستانه دور دوم انتخابات ریاست جمهوری فرانسه بر رقیب خود یعنی مارین لوپن پیشی گرفته است.</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 10:48:09 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>روسیه عملیات هوایی در سوریه را متوقف کرد</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691247/روسیه-عملیات-هوایی-در-سوریه-را-متوقف-کرد</link>\n" +
"         <description>فرماندهی عملیات نظامی روسیه در سوریه از اول ماه مه به دلیل ایجاد شرایط مساعد برای امضای تفاهمنامه مربوط به مناطق کاهش تنش، عملیات هوایی در این مناطق را متوقف کرد.</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 10:44:59 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>افشاگری باوئرمن درباره توصیه‌‌‌ مشحون برای حذف ستاره ها</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691250/افشاگری-باوئرمن-درباره-توصیه‌‌‌-مشحون-برای-حذف-ستاره-ها</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 10:44:36 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>یورش جدید ارتش عراق شروعی برای پایان داعش است</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691246/یورش-جدید-ارتش-عراق-شروعی-برای-پایان-داعش-است</link>\n" +
"         <description>سخنگوی ائتلاف بین‌المللی علیه داعش از حمله جدید ارتش عراق برای بازپس گرفتن شهر موصل خبر داد.</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 10:43:24 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>ساعت به ساعت با قیمت دلار آمریکا، یورو و درهم</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691244/ساعت-به-ساعت-با-قیمت-دلار-آمریکا-یورو-و-درهم</link>\n" +
"         <description>نبض قیمت دلار، یورو و درهم امارات به عنوان پرطرفدارترین ارزهای مورد معامله در بازار آزاد ارز کشور از 8 صبح تا 18 عصر چگونه می‌زند؟ شما می‌توانید راس هر ساعت از میانگین قیمت خرید و فروش دلار آمریکا، یورو و درهم امارات در صرافی های مجاز اطلاع کسب کنید.</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 10:42:25 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>خطرسقوط سهمیه؛بیخ گوش فوتبال ایران</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691245/خطرسقوط-سهمیهبیخ-گوش-فوتبال-ایران</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 10:40:22 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>تعیین شهریه سال ۹۷ - ۹۶ مدارس غیردولتی تهران</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691243/تعیین-شهریه-سال-۹۷-۹۶-مدارس-غیردولتی-تهران</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 10:34:06 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>ثبت ۲۰ روز هوای سالم متوالی در تهران</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691242/ثبت-۲۰-روز-هوای-سالم-متوالی-در-تهران</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 10:33:28 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>فراخوان مشمولان دیپلم و زیردیپلم در اردیبهشت ۹۶</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691241/فراخوان-مشمولان-دیپلم-و-زیردیپلم-در-اردیبهشت-۹۶</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 10:31:31 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>گریه چه فوایدی دارد؟</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691240/گریه-چه-فوایدی-دارد</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 10:31:09 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>ترافیک نیمه‌سنگین در آزادراه کرج - تهران</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691239/ترافیک-نیمه‌سنگین-در-آزادراه-کرج-تهران</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 10:30:14 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>«شاخ بوفالو»؛ جراحی زیبایی عجیب در تایلند</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691235/شاخ-بوفالو-جراحی-زیبایی-عجیب-در-تایلند</link>\n" +
"         <description>جدیدترین اخبار گوناگون را در «تابناک با تو» از دست ندهید. در این سایت شما هر روز گزید‌ه‌ای از آخرین اخبار پیرامون موضوعات خانواده، سلامت و بهداشت، سرگرمی و دانستنی‌ها، آشپزی، فیلم و عکس‌هایی از سراسر جهان، دکوراسیون و ... را دنبال خواهید کرد. همچنین «تابناک باتو» هر روزه آماده‌ است، مطالب ارسالی شما را نیز ـ متناسب با موضوعات نامبرده ـ‌ در سایت منتشر کند.</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 10:25:27 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>«قتل پدرزن» به دست داماد جوان</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691238/قتل-پدرزن-به-دست-داماد-جوان</link>\n" +
"         <description>2 کشته در ریزش دیوار کارخانه/ عوامل حادثه پارك شهرستان حميديه دستگير شدند/ دستگیری شرور تبر به‌دست/ مرگ ناگوار 2 کارتن خواب زیر آوار بتن/ برق گرفتگی و مرگ یک زوج گیلانی/ قاتل فراری نزاع خونین در شاهرود دستگیر شد/ آتش‌سوزي در چهار‌راه جهان كودك/ «قتل پدرزن» به دست داماد جوان</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 10:20:36 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>۲ کشته در ریزش دیوار کارخانه</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691237/۲-کشته-در-ریزش-دیوار-کارخانه</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 10:19:25 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>عوامل حادثه پارك شهرستان حميديه  دستگير شدند</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691236/عوامل-حادثه-پارك-شهرستان-حميديه-دستگير-شدند</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 10:18:47 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>حضور نماینده رهبر انقلاب درمحل حادثه معدن آزادشهر</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691234/حضور-نماینده-رهبر-انقلاب-درمحل-حادثه-معدن-آزادشهر</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 10:15:32 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>گریه چه فوایدی دارد؟</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691233/گریه-چه-فوایدی-دارد</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 10:01:08 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>مناطق آزاد کشور فنس‌کشی و دیوارکشی می‌شود</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691028/مناطق-آزاد-کشور-فنس‌کشی-و-دیوارکشی-می‌شود</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 10:01:01 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>پیروز مناظره دوم از نگاه مخالفان و موافقان دولت/ مظلومیت معدنچیان با بیمه کتابداری و آرایشگری!</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691205/پیروز-مناظره-دوم-از-نگاه-مخالفان-و-موافقان-دولت-مظلومیت-معدنچیان-با-بیمه-کتابداری-و-آرایشگری</link>\n" +
"         <description>روزنامه های امروز، مناظره دیروز شش نامزد ریاست جمهوری در صدا وسیما را تحلیل و بررسی نموده اند. روزنامه های اصلاح طلب و موافق دولت، این مناظره را بازگشت روحانی قلمداد کرده اند؛ اما مخالفان دولت این مناظره را نشانی از مشت خالی دولت در ارائه برنامه دانسته اند.</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 10:00:01 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>تولید قرص ورزش در آینده نزدیک</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691230/تولید-قرص-ورزش-در-آینده-نزدیک</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 09:55:01 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>همه شهرهای جهانی ایران</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691231/همه-شهرهای-جهانی-ایران</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 09:50:10 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>چه کسی جان مارادونا را نجات داد؟</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691232/چه-کسی-جان-مارادونا-را-نجات-داد</link>\n" +
"         <description>۱۳ سال است که دیگر به مواد مخدر نزدیک نشده‌ام. با فوتبال بازی کردن در کنار فرزندانم از زندگی لذت می‌برم و شخص دیگری شده‌ام. حمایت خانواده‌ام باعث شد تا بتوانم دوباره به زندگی برگردم. دخترم دالما زندگی من را نجات داد و باعث شد تا به هوش آیم.</description>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 09:48:51 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>دستگیری شرور تبر به‌دست</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691168/دستگیری-شرور-تبر-به‌دست</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 09:47:02 +0430</pubDate>\n" +
"      </item>\n" +
"      <item>\n" +
"         <title>غرفه کودک و نوجوان در نمایشگاه کتاب تهران</title>\n" +
"         <link>http://www.tabnak.ir/fa/news/691229/غرفه-کودک-و-نوجوان-در-نمایشگاه-کتاب-تهران</link>\n" +
"         <author>info@tabnak.ir</author>\n" +
"         <pubDate>06 May 2017 09:44:29 +0430</pubDate>\n" +
"      </item>\n" +
"   </channel>\n" +
"</rss>\n" +
"\n" +
"BUILD SUCCESSFUL (total time: 27 seconds)\n" +
"";
        // </editor-fold> 
        
        int cnt = 0;
        ArrayList<news> allNews;
        allNews = new ArrayList<>();
        
        Matcher m = Pattern.compile("<item>[^`]*?</item>").matcher(data);
        while(m.find()){
            String all = data.substring(m.start(), m.end()), title = null, link = null, description = null, author = null, imageURL = null, date = null;
            Matcher matcher = Pattern.compile("<title>(.*?)</title>").matcher(all); 
            if (matcher.find()) title = matcher.group(1);
            matcher = Pattern.compile("<link>(.*?)</link>").matcher(all);
            if (matcher.find()) link = matcher.group(1);
            matcher = Pattern.compile("<description>(.*?)</description>").matcher(all);
            if (matcher.find()) description = matcher.group(1);
            matcher = Pattern.compile("<author>(.*?)</author>").matcher(all);
            if (matcher.find()) author = matcher.group(1);
            matcher = Pattern.compile("<pubDate>(.*?)</pubDate>").matcher(all);
            if (matcher.find()) date = matcher.group(1);
            matcher = Pattern.compile("<media:content url=\"(.*?)\"").matcher(all);
            if (matcher.find()) imageURL = matcher.group(1);
            Image image = null;
            try {
                URL url = new URL(imageURL);
                image = ImageIO.read(url);
            } catch (IOException e) { }
            allNews.add(new news(title, link, description, author, date, image, cnt));
            cnt++;
        }
        
        return allNews;
    }
    
    public static void main(String[] args) throws IOException {
        
        new MainView().setVisible(true);
    }
    
}
