package tech.barny.sda;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Zbiory {

    public static void main(String[] args) {
        // psvm
        Set<String> ludzie = new HashSet<>();
        ludzie.add("Dominika");
        ludzie.add("Stefan");
        ludzie.add("Leo");
        ludzie.add("Zenon");
        ludzie.add("Wacek");
        ludzie.add("Marek");
        ludzie.add("Placek");
        System.out.println(ludzie);

        Iterator<String> iterator = ludzie.iterator();
        while (iterator.hasNext()) {
            String osoba = iterator.next();
        }

        for (String osoba : ludzie) {
        }

        boolean stefan = ludzie.contains("Stefan");
        System.out.println(stefan);
        System.out.println(ludzie.contains("Barbara"));



        String lorem = "\n" + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam blandit lorem ligula, quis vehicula augue maximus sit amet. Ut pulvinar auctor metus, vitae semper magna porta facilisis. Morbi quis molestie mauris, eu congue mauris. Vestibulum quis venenatis orci, in condimentum orci. In venenatis massa et dui rhoncus efficitur. Nulla porta metus ac purus fringilla tristique. Cras feugiat a quam ut sodales.\n" +
                "\n" +
                "Etiam pretium mi sit amet nulla auctor auctor. Vivamus fermentum dignissim dapibus. Nam ornare neque dolor, vitae pretium ligula tincidunt nec. Integer dapibus semper varius. Sed eget dignissim diam, at luctus diam. Ut eu nunc mattis, blandit odio nec, molestie massa. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Praesent arcu lorem, maximus ac arcu eget, fermentum ultrices nisi. Phasellus sed gravida augue, at tristique turpis. Maecenas ac nisl molestie, molestie tellus eu, bibendum elit. Pellentesque eu volutpat nisl. Ut convallis mi orci, sit amet suscipit justo fermentum ut.\n" +
                "\n" +
                "Praesent scelerisque tristique ex, nec porta eros pretium sed. Sed a augue at orci dignissim ultrices sit amet quis nulla. Nulla sem turpis, varius ac hendrerit at, dignissim ut risus. Cras pretium placerat maximus. Suspendisse tincidunt et risus eu rutrum. Suspendisse vestibulum vehicula mi ac rhoncus. Sed aliquam quam et tortor volutpat, vel semper ipsum luctus. Nulla sapien dolor, auctor a neque eu, pharetra posuere tellus. Integer convallis commodo erat. Donec nisi leo, efficitur sed fermentum id, finibus vel felis. Morbi faucibus justo eros, sed finibus purus egestas sed.\n" +
                "\n" +
                "Pellentesque vitae erat quis eros gravida aliquet. In at consectetur odio. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Duis sit amet sapien bibendum libero ornare eleifend. Etiam eu leo vitae leo convallis tristique id at libero. Nunc vel interdum leo. Cras imperdiet semper elit, ac faucibus lorem. Morbi ullamcorper sollicitudin consequat. Ut quis convallis tortor. Nulla tincidunt lectus arcu, eget interdum erat fermentum quis. Nulla ac interdum nunc. Nunc finibus purus eu nunc placerat mollis. Quisque lorem ipsum, mollis vel felis eu, congue viverra massa. Integer faucibus pellentesque eros, sit amet tempor ipsum convallis commodo.\n" +
                "\n" +
                "Etiam lobortis molestie turpis, in pretium odio pulvinar eget. Morbi scelerisque, dolor posuere venenatis egestas, ante nisl faucibus nunc, et ullamcorper felis diam vitae diam. Sed turpis felis, viverra non mattis eu, commodo in arcu. Nam porttitor tincidunt tortor a sagittis. Etiam eu lorem tellus. Donec efficitur tincidunt arcu, sit amet porta sem vestibulum in. Quisque interdum laoreet odio sed maximus. Praesent tempus diam a dui posuere, quis consectetur urna accumsan. Cras faucibus aliquet nunc et molestie. Phasellus diam turpis, lobortis gravida porta quis, molestie in erat. Sed vestibulum, felis eu maximus vehicula, lorem nunc rhoncus lorem, quis consequat dolor velit in odio.";
        HashSet<String> słowa = new HashSet<>();
        for (String słowo : lorem.split("[s.,]+")) {
            if (!słowo.isEmpty()){
                słowa.add(słowo.toLowerCase());
            }
        };
        System.out.println(słowa);
        System.out.println(słowa.size());

    }
}
