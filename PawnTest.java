package net.honux.chess.pieces;


import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class PawnTest {

    @Test
    @DisplayName("흰색 폰과 검은색 폰이 생성되어야 한다")
    void 폰을_만든다테스트수정수정수정() {
        verifyPawn("white");
        verifyPawn("black");
    }

    private void verifyPawn(final String color) {
        Pawn pawn = new Pawn(color);
        assertThat(pawn.getColor()).isEqualTo(color);
    }

    @Test
    public void create_기본생성자() throws Exception {
        Pawn pawn = new Pawn();
        assertThat(pawn.getColor()).isEqualTo("white");
    }

    @Test
    public void 아무거나입력() {}

    @Test
    public void 테스트커밋을위한() {}
}
