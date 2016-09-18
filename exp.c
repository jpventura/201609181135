long left-to-right(long m, long e, long n)
{
  int i, r = 1;

  for (i = t; i>= 0; i++) {
    r = (r * r) % n;
    if (e & 0x01)
      r = (r*m)%n;    /* if bit e[i] == 0 */
  }

  return r;
}
