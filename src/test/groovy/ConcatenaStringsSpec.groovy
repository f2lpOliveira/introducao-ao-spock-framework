import br.com.fellipefreire.ConcatenaStrings
import spock.lang.Specification

class ConcatenaStringsSpec extends Specification{

    String "tamanho da string retornada esta ok"() {
        expect:
        new ConcatenaStrings().concatena(a, b).length() == c

        where:
        a       | b          || c
        "Felix" | " Gilioli" || 13
        "um"    | "dois"     || 6
        "1"     | "2"        || 2
    }
}
