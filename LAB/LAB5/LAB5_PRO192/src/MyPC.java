
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author DUKE
 */
public class MyPC implements IString, IPC {

    public MyPC() {
    }

    @Override
    public int F13_countChar(String s, char x) {
        // Tra ve so luong ky tu x trong chuoi s
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == x) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String F14_normalization(String s) {
        // Chuan hoa chuoi s
        // Moi tu duoc ngan cach boi chi 1 khoang trang
        // Chuan hoa dau cham va dau phay trong chuoi s
        s = s.replaceAll("\\s+", " "); // Thay the nhieu khoang trang bang 1 khoang trang
        s = s.replaceAll("[,.]", " $0"); // Them khoang trang truoc dau cham va dau phay
        s = s.trim(); // Xoa khoang trang o dau va cuoi chuoi

        String[] words = s.split(" ");
        StringBuilder normalized = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                // Viet hoa ky tu dau tien neu no la chu cai
                normalized.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1)).append(" ");
            }
        }

        return normalized.toString().trim();
    }

    @Override
    public String F15_replace1(String s, char x) {
        // Thay the tat ca cac tu dai nhat trong s bang x
        String[] words = s.split(" ");
        int maxLength = 0;

        // Tim do dai cua tu dai nhat
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }

        // Thay the cac tu dai nhat
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == maxLength) {
                words[i] = String.valueOf(x);
            }
        }

        return String.join(" ", words);
    }

    @Override
    public String F16_replace2(String s, char x) {
        // Thay the tat ca cac tu palindrome bang x
        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            String reversed = new StringBuilder(words[i]).reverse().toString();
            if (words[i].equalsIgnoreCase(reversed)) {
                words[i] = String.valueOf(x);
            }
        }

        return String.join(" ", words);
    }

    @Override
    public String F17_replace3(String s, char x) {
        // Thay the tat ca cac tu ngan nhat trong s bang x
        String[] words = s.split(" ");
        int minLength = Integer.MAX_VALUE;

        // Tim do dai cua tu ngan nhat
        for (String word : words) {
            if (word.length() < minLength && !word.isEmpty()) {
                minLength = word.length();
            }
        }

        // Thay the cac tu ngan nhat
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == minLength) {
                words[i] = String.valueOf(x);
            }
        }

        return String.join(" ", words);
    }

    @Override
    public String F18_replace4(String s, char x) {
        // Thay the tu dai nhat cuoi cung trong s bang x
        String[] words = s.split(" ");
        int maxLength = 0;
        int lastIndex = -1;

        // Tim do dai cua tu dai nhat va chi so cua no
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= maxLength) {
                maxLength = words[i].length();
                lastIndex = i; // Cap nhat chi so cua tu dai nhat
            }
        }

        // Thay the tu dai nhat cuoi cung
        if (lastIndex != -1) {
            words[lastIndex] = String.valueOf(x);
        }

        return String.join(" ", words);
    }

    @Override
    public int F19_find(String sub, String s) {
        // Tra ve vi trí dau tien cua chuoi con sub trong chuoi s.
        // Neu sub khong co trong s, tra ve -1.
        int index = s.indexOf(sub);
        return index; // index se la -1 neu khong tim thay
    }

    @Override
    public int F1_count1(List<PC> t, String m) {
        // Dem so luong PC trong danh sach t co model bang m (khong phan biet chu hoa chu thuong)
        int count = 0;
        for (PC pc : t) {
            if (pc.getModel().equalsIgnoreCase(m)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int F2_count2(List<PC> t, double p) {
        // Dem so luong PC trong danh sach t co gia bang p
        int count = 0;
        for (PC pc : t) {
            if (pc.getPrice() == p) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int F3_count3(List<PC> t, double r) {
        // Dem so luong PC trong danh sach t co ty le bang r
        int count = 0;
        for (PC pc : t) {
            if (pc.getRate() == r) {
                count++;
            }
        }
        return count;
    }

    @Override
    public List<PC> F4_sublist(List<PC> t, String m) {
        // Tra ve danh sach con cua List t nơi PC co model bang m (khong phan biet chu hoa chu thường)
        List<PC> sublist = new ArrayList<>();
        for (PC pc : t) {
            if (pc.getModel().equalsIgnoreCase(m)) {
                sublist.add(pc);
            }
        }
        return sublist;
    }

    @Override
    public PC F5_find1(List<PC> t) {
        PC maxPricePC = null;

        for (PC pc : t) {
            if (pc.getModel().equalsIgnoreCase("DELL")) {
                if (maxPricePC == null || pc.getPrice() > maxPricePC.getPrice()) {
                    maxPricePC = pc;
                    return maxPricePC;
                }
            }
        }

        return maxPricePC;
    }

    @Override
    public PC F6_find2(List<PC> t) {
        // Tim PC cuoi cung trong danh sach t co gia cao nhat va model bang DELL
        PC maxPricePC = null;
        for (PC pc : t) {
            if (pc.getModel().equalsIgnoreCase("DELL")) {
                if (maxPricePC == null || pc.getPrice() >= maxPricePC.getPrice()) {
                    maxPricePC = pc;
                }
            }
        }
        return maxPricePC;
    }

    @Override
    public List<PC> F7_find3(List<PC> t, String m) {
        // Tim tat ca PC trong danh sach t co ty le thap nhat va model bang m (khong phan biet chu hoa chu thường)
        List<PC> minRatePCs = new ArrayList<>();
        double minRate = Double.MAX_VALUE;

        for (PC pc : t) {
            if (pc.getModel().equalsIgnoreCase(m)) {
                if (pc.getRate() < minRate) {
                    minRate = pc.getRate();
                }
            }
        }

        for (PC pc : t) {
            if (pc.getModel().equalsIgnoreCase(m) && pc.getRate() == minRate) {
                minRatePCs.add(pc);
            }
        }
        return minRatePCs;
    }

    @Override
    public List<PC> F8_find4(List<PC> t, String m) {
        // Tim tat ca PC trong danh sach t co ty le cao nhat va model bang m (khong phan biet chu hoa chu thường)
        List<PC> maxRatePCs = new ArrayList<>();
        double maxRate = Double.MIN_VALUE;

        for (PC pc : t) {
            if (pc.getModel().equalsIgnoreCase(m)) {
                if (pc.getRate() > maxRate) {
                    maxRate = pc.getRate();
                }
            }
        }

        for (PC pc : t) {
            if (pc.getModel().equalsIgnoreCase(m) && pc.getRate() == maxRate) {
                maxRatePCs.add(pc);
            }
        }
        return maxRatePCs;
    }

    @Override
    public void F9_remove1(List<PC> t, String m) {
        // Xoa tat ca PC co model bang m (khong phan biet chu hoa chu thường)
        t.removeIf(pc -> pc.getModel().equalsIgnoreCase(m));
    }

    @Override
    public void F10_remove1(List<PC> t, String m, double r) {
        // Xoa tat ca PC co model bang m va ty le bang r
        t.removeIf(pc -> pc.getModel().equalsIgnoreCase(m) && pc.getRate() == r);
    }

    @Override
    public void F11_remove1(List<PC> t, String m, double r, double p) {
        // Xoa tat ca PC co model bang m, ty le bang r va gia bang p
        t.removeIf(pc -> pc.getModel().equalsIgnoreCase(m) && pc.getRate() == r && pc.getPrice() == p);
    }

    @Override
    public double F12_average(List<PC> t, String m) {
        // Tính gia trung binh cua tat ca PC co model bang m (khong phan biet chu hoa chu thường)
        double total = 0;
        int count = 0;

        for (PC pc : t) {
            if (pc.getModel().equalsIgnoreCase(m)) {
                total += pc.getPrice();
                count++;
            }
        }

        // Tra ve gia trung binh, neu khong co PC nao thi tra ve 0
        return count > 0 ? total / count : 0;
    }

}
