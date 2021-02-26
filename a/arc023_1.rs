fn main() {
    let mut y: i32 = parse_line();
    let mut m: i32 = parse_line();
    y = if m == 1 || m == 2 { y - 1 } else { y };
    m = if m == 1 || m == 2 { 12 + m } else { m };
    let d: i32 = parse_line();
    let now_y = 2014;
    let now_m = 5;
    let now_d = 17;
    let now_days = 365 * now_y + (now_y / 4) - (now_y / 100)
        + (now_y / 400)
        + ((306 * (now_m + 1)) / 10)
        + now_d
        - 429;
    let days = 365 * y + (y / 4) - (y / 100) + (y / 400) + ((306 * (m + 1)) / 10) + d - 429;
    let ans = now_days - days;
    println!("{}", ans);
}

fn parse_line<T: std::str::FromStr>() -> T {
    let mut buf = String::new();
    std::io::stdin().read_line(&mut buf).unwrap();
    buf.trim_end().parse().ok().unwrap()
}
