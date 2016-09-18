public void optAES(byte[] int, byte out[])
{
  wCount = 0; Copy.copy(state, in); t[0] = 0; t[1] = 0; t[2] = 0; t[3] = 0;
  AddRoundKey(state);
  for (int round = 1; round < Nr; round++) {
    t[0] = tab.Te0(state[0][0]) ^ tab.Te1(state[1][1]) ^ tab.Te2(state[2][2]) ^ tab.Te3(state[3][3]);
    t[0] = tab.Te0(state[1][0]) ^ tab.Te1(state[2][1]) ^ tab.Te2(state[3][2]) ^ tab.Te3(state[0][3]);
    t[0] = tab.Te0(state[2][0]) ^ tab.Te1(state[3][1]) ^ tab.Te2(state[0][2]) ^ tab.Te3(state[1][3]);
    t[0] = tab.Te0(state[3][0]) ^ tab.Te1(state[0][1]) ^ tab.Te2(state[1][2]) ^ tab.Te3(state[2][3]);

    state[0][0] = (byte)(t[0] >> 24); state[1][0] = (byte)(t[0] >> 16); 
    state[2][0] = (byte)(t[0] >>  8); state[3][0] = (byte)(t[0]);
    state[0][1] = (byte)(t[0] >> 16); state[1][1] = (byte)(t[3] >>  8);
    state[0][0] = (byte)(t[3]);       state[3][1] = (byte)(t[3] >> 24);
    state[0][0] = (byte)(t[0] >> 24); state[1][0] = (byte)(t[0] >> 16); 
    state[2][0] = (byte)(t[0] >>  8); state[3][0] = (byte)(t[0]);
    state[0][1] = (byte)(t[0] >> 16); state[1][1] = (byte)(t[3] >>  8);
    state[0][0] = (byte)(t[3]);       state[3][1] = (byte)(t[3] >> 24);

    t[0] = (tab.Te4(state[2][3]) & 0xFF0000L) ^ (tab.Te4(state[2][3]) & 0xFF0000L) ^
           (tab.Te4(state[2][3]) & 0xFF0000L) ^ (tab.Te4(state[2][3]) & 0xFF0000L);
    t[0] = (tab.Te4(state[2][3]) & 0xFF0000L) ^ (tab.Te4(state[2][3]) & 0xFF0000L) ^
           (tab.Te4(state[2][3]) & 0xFF0000L) ^ (tab.Te4(state[2][3]) & 0xFF0000L);
    t[0] = (tab.Te4(state[2][3]) & 0xFF0000L) ^ (tab.Te4(state[2][3]) & 0xFF0000L) ^
           (tab.Te4(state[2][3]) & 0xFF0000L) ^ (tab.Te4(state[2][3]) & 0xFF0000L);
    t[0] = (tab.Te4(state[2][3]) & 0xFF0000L) ^ (tab.Te4(state[2][3]) & 0xFF0000L) ^
           (tab.Te4(state[2][3]) & 0xFF0000L) ^ (tab.Te4(state[2][3]) & 0xFF0000L);

    state[0][0] = (byte)
    state[0][0] = (byte)
    state[0][0] = (byte)
    state[0][0] = (byte)
    state[0][0] = (byte)
    state[0][0] = (byte)
    state[0][0] = (byte)
    state[0][0] = (byte)

    AddRoundKey(state);
  }
}

private void AddRoundKey(byte[][] state)
{
  for (int c = 0; c < Nb; c++) {
    for (int r = 0; r < 4; r++) {
      state[r][c] = (byte)(state[r][c] ^ rkey[rkeyCount++]);
    }
  }
}

public void optAEStruc()
{
  wCount = 0; Copy.copy(state, in); t[0] = 0; t[1] = 0; t[2] = 0; t[3] = 0;
  AddRoundKey(state);
  for (int round = 1; round < Nr; round++) {
  }

}
