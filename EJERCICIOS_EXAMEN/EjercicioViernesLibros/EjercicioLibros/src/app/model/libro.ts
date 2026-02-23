export class libro {
  id: number | undefined;
  Year: number | undefined;
  Title: string | undefined;
  handle: string | undefined;
  Publisher: string | undefined;
  ISBN: string | undefined;
  Pages: number | undefined;
  Notes: string[] | undefined;
  created_at: string | undefined;
  villains: Villain[] | undefined;
}

export class Villain {
  name: string | undefined;
  url: string | undefined;
}
