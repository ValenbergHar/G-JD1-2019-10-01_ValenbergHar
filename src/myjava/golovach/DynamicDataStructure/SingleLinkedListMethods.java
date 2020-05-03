package golovach.DynamicDataStructure;

/**
 * Created by AdminAccount on 22.11.2015.
 */
public class SingleLinkedListMethods {

    public static void main(String[] args) {
        Node tail = SingleLinkedListTest12.generateIter0(3); print(tail);
        addIter(tail, 10); print(tail);
        addRec(tail, 20); print(tail);
        removeIter(tail); print(tail);
        removeRec(tail); print(tail);
        addIter(tail, 1, -1); print(tail);
        removeIter(tail, 1); print(tail);
        addIter(tail, 1, -1); print(tail);
        removeRec(tail, 1); print(tail);


        System.out.println("Р Р°Р·РјРµСЂ СЃРїРёСЃРєР° (РёС‚РµСЂР°С‚РёРІРЅРѕ)= " + sizeIter(tail));
        System.out.println("Р Р°Р·РјРµСЂ СЃРїРёСЃРєР° (СЂРµРєСѓСЂСЃРёРІРЅРѕ)= " + sizeRec(tail));

        System.out.println("РЎСѓРјРјР° СЌР»РµРјРµРЅС‚РѕРІ СЃРїРёСЃРєР° (РёС‚РµСЂР°С‚РёРІРЅРѕ)= " + sumIter(tail));
        System.out.println("РЎСѓРјРјР° СЌР»РµРјРµРЅС‚РѕРІ СЃРїРёСЃРєР° (СЂРµРєСѓСЂСЃРёРІРЅРѕ)= " + sumRec(tail));

        System.out.println("РњР°РєСЃРёРјР°Р»СЊРЅС‹Р№ СЌР»РµРјРµРЅС‚ СЃРїРёСЃРєР° (РёС‚РµСЂР°С‚РёРІРЅРѕ)= " + maxIter(tail));
        System.out.println("РњР°РєСЃРёРјР°Р»СЊРЅС‹Р№ СЌР»РµРјРµРЅС‚ СЃРїРёСЃРєР° (СЂРµРєСѓСЂСЃРёРІРЅРѕ)= " + maxRec(tail));

    }

    public static void print(Node tail){
        System.out.println(SingleLinkedListTest12.toStringIter(tail));
    }

    //Р�С‚РµСЂР°С‚РёРІРЅС‹Р№ РїРѕРґСЃС‡РµС‚ РєРѕР»РёС‡РµСЃС‚РІР° СЌР»РµРјРµРЅС‚РѕРІ РїРµСЂРµРґР°РЅРЅРѕРіРѕ СЃРїРёСЃРєР°
    public static int sizeIter(Node node){
        int size = 0;
        while (node != null){
            size++;
            node = node.next;
        }
        return size;
    }

    //Р РµРєСѓСЂСЃРёРІРЅС‹Р№ РїРѕРґСЃС‡РµС‚ РєРѕР»РёС‡РµСЃС‚РІР° СЌР»РµРјРµРЅС‚РѕРІ РїРµСЂРµРґР°РЅРЅРѕРіРѕ СЃРїРёСЃРєР°
    public static int sizeRec(Node node){
        if (node.next == null) return 1;
        else{
            return 1 + sizeRec(node.next);
        }
    }

    //Р�С‚РµСЂР°С‚РёРІРЅС‹Р№ РїРѕРґСЃС‡РµС‚ СЃСѓРјРјС‹ РІСЃРµС… СЌР»РµРјРµРЅС‚РѕРІ РїРµСЂРµРґР°РЅРЅРѕРіРѕ СЃРїРёСЃРєР°
    public static int sumIter(Node node){
        int sum = 0;
        while (node != null){
            sum += node.value;
            node = node.next;
        }
        return sum;
    }

    //Р РµРєСѓСЂСЃРёРІРЅС‹Р№ РїРѕРґСЃС‡РµС‚ СЃСѓРјРјС‹ РІСЃРµС… СЌР»РµРјРµРЅС‚РѕРІ РїРµСЂРµРґР°РЅРЅРѕРіРѕ СЃРїРёСЃРєР°
    public static int sumRec(Node node){
        if (node.next == null) return node.value;
        else{
            return node.value + sumRec(node.next);
        }
    }

    //Р�С‚РµСЂР°С‚РёРІРЅС‹Р№ РїРѕРёСЃРє РјР°РєСЃРёРјР°Р»СЊРЅРѕРіРѕ СЌР»РµРјРµРЅС‚Р° РІ РїРµСЂРµРґР°РЅРЅРѕРј СЃРїРёСЃРєРµ
    public static int maxIter(Node node){
        int max = node.value;
        while (node != null){
            if(node.value > max) max = node.value;
            node = node.next;
        }
        return max;
    }

    //Р РµРєСѓСЂСЃРёРІРЅС‹Р№ РїРѕРёСЃРє РјР°РєСЃРёРјР°Р»СЊРЅРѕРіРѕ СЌР»РµРјРµРЅС‚Р° РІ РїРµСЂРµРґР°РЅРЅРѕРј СЃРїРёСЃРєРµ
    public static int maxRec(Node node){
        if (node.next == null) return node.value;
        else{
            int max = maxRec(node.next);
            if (node.value > max) return node.value;
            else return max;
        }
    }

    //Р�С‚РµСЂР°С‚РёРІРЅРѕРµ РґРѕР±Р°РІР»РµРЅРёРµ СЌР»РµРјРµРЅС‚Р° РІ РєРѕРЅРµС† СЃРїРёСЃРєР° (РІ РіРѕР»РѕРІСѓ)
    public static void addIter(Node node, int value){
        while (node.next != null){
            node = node.next;
        }
        node.next = new Node(value, null);
    }

    //Р РµРєСѓСЂСЃРёРІРЅРѕРµ РґРѕР±Р°РІР»РµРЅРёРµ СЌР»РµРјРµРЅС‚Р° РІ РєРѕРЅРµС† СЃРїРёСЃРєР° (РІ РіРѕР»РѕРІСѓ)
    public static void addRec(Node node, int value){
        if (node.next == null) node.next = new Node(value, null);
        else addRec(node.next, value);
    }

    //Р�С‚РµСЂР°С‚РёРІРЅРѕРµ РґРѕР±Р°РІР»РµРЅРёРµ СЌР»РµРјРµРЅС‚Р° РЅР° i-СѓСЋ РїРѕР·РёС†РёСЋ
    public static void addIter(Node node, int index, int value){
        if (index == 0) {
            System.out.println("addIter(node, index, value): РІСЃС‚Р°РІРєР° РІ 0 РїРѕР·РёС†РёСЋ РЅРµРІРѕР·РјРѕР¶РЅР°");
        }else if(index > sizeIter(node)){
            System.out.println("addIter(node, index, value): РІСЃС‚Р°РІРєР° РЅРµРІРѕР·РјРѕР¶РЅР°, С‚.Рє. РёРЅРґРµРєСЃ Р±РѕР»СЊС€Рµ РґР»РёРЅС‹ СЃРїРёСЃРєР°");
        }else {
            int k = 1;
            while (k < index){
                node = node.next;
                k++;
            }
            node.next = new Node(value, node.next);
        }

    }

    //Р РµРєСѓСЂСЃРёРІРЅРѕРµ РґРѕР±Р°РІР»РµРЅРёРµ СЌР»РµРјРµРЅС‚Р° РЅР° i-СѓСЋ РїРѕР·РёС†РёСЋ
    public static void addRec(Node node, int index, int value){
        if (index == 0) {
            System.out.println("addRec(node, index, value): РІСЃС‚Р°РІРєР° РІ 0 РїРѕР·РёС†РёСЋ РЅРµРІРѕР·РјРѕР¶РЅР°");
        }else if(index > sizeRec(node)){
            System.out.println("addRec(node, index, value): РІСЃС‚Р°РІРєР° РЅРµРІРѕР·РјРѕР¶РЅР°, С‚.Рє. РёРЅРґРµРєСЃ Р±РѕР»СЊС€Рµ РґР»РёРЅС‹ СЃРїРёСЃРєР°");
        }else if(index == 1){
            node.next = new Node(value, node.next);
        } else addRec(node.next, index - 1, value);

    }

    //Р�С‚РµСЂР°С‚РёРІРЅРѕРµ СѓРґР°Р»РµРЅРёРµ СЌР»РµРјРµРЅС‚Р° РёР· РєРѕРЅС†Р° СЃРїРёСЃРєР° (РёР· РіРѕР»РѕРІС‹)
    public static void removeIter(Node node){
        if (node.next == null || node == null) return;
        while (node.next.next != null){
            node = node.next;
        }
        node.next = null;
    }

    //Р РµРєСѓСЂСЃРёРІРЅРѕРµ СѓРґР°Р»РµРЅРёРµ СЌР»РµРјРµРЅС‚Р° РёР· РєРѕРЅС†Р° СЃРїРёСЃРєР° (РёР· РіРѕР»РѕРІС‹)
    public static void removeRec(Node node){
        if (node.next == null || node == null) return;
        if (node.next.next == null) {
            node.next = null;
        }else {
            removeRec(node.next);
        }
    }

    //Р�С‚РµСЂР°С‚РёРІРЅРѕРµ СѓРґР°Р»РµРЅРёРµ СЌР»РµРјРµРЅС‚Р° РёР· i-РѕР№ РїРѕР·РёС†РёРё
    public static void removeIter(Node node, int index){
        if (index == 0) {
            System.out.println("removeIter(node, index): СѓРґР°Р»РµРЅРёРµ РёР· 0 РїРѕР·РёС†РёРё РЅРµРІРѕР·РјРѕР¶РЅРѕ");
        }else if(index >= sizeIter(node)){
            System.out.println("removeIter(node, index): СѓРґР°Р»РµРЅРёРµ РЅРµРІРѕР·РјРѕР¶РЅРѕ, С‚.Рє. РёРЅРґРµРєСЃ Р±РѕР»СЊС€Рµ РґР»РёРЅС‹ СЃРїРёСЃРєР°");
        }else {
            int k = 1;
            while (k < index){
                node = node.next;
                k++;
            }
            node.next = node.next.next;
        }

    }

    //Р РµРєСѓСЂСЃРёРІРЅРѕРµ СѓРґР°Р»РµРЅРёРµ СЌР»РµРјРµРЅС‚Р° РёР· i-РѕР№ РїРѕР·РёС†РёРё
    public static void removeRec(Node node, int index){
        if (index == 0) {
            System.out.println("removeRec(node, index): СѓРґР°Р»РµРЅРёРµ РёР· 0 РїРѕР·РёС†РёРё РЅРµРІРѕР·РјРѕР¶РЅРѕ");
        }else if(index >= sizeRec(node)){
            System.out.println("removeRec(node, index): СѓРґР°Р»РµРЅРёРµ РЅРµРІРѕР·РјРѕР¶РЅРѕ, С‚.Рє. РёРЅРґРµРєСЃ Р±РѕР»СЊС€Рµ РґР»РёРЅС‹ СЃРїРёСЃРєР°");
        }else if(index == 1){
            node.next = node.next.next;
        } else removeRec(node.next, index - 1);

    }
}
