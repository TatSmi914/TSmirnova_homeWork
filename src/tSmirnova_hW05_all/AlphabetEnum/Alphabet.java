package tSmirnova_hW05_all.AlphabetEnum;

public enum Alphabet {

    A, B, C, D, E,
    F, G, H, I, J,
    K, L, M, N, O,
    P, Q, R, S, T,
    U, V, W, X, Y, Z;

    int getLetterPosition() {
        return ordinal() + 1;
    }
}