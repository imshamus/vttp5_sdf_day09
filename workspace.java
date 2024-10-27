public class workspace {
     // PLAYER

        // if player 10 || J || Q || K && A,                player win with BJ
            // End game, show results (banker and player)

        // if player A && A,                                player win with BB
            // End game, show results (banker and player)

        // if player < 16,                                  player must draw

        // if player > 16 && < 21,                          prompt draw
            // player draw
                // if player > 16 && < 21,                  prompt draw or not
                // if player == 21,                         banker's turn, 
                // if player 5 cards <= 21,                 player default win
                // if player > 21,                          banker's turn

            // player no draw
                // banker's turn

        // BANKER
        // if player 10 || J || Q || K && A,                banker win with BJ
            // End game, show results (banker and player)

        // if banker A && A,                                banker win with BB
            // End game, show results (banker and player)

        // if banker < 16,                                  banker must draw
        // if banker > 21 && player <= 21,                  banker lose with bust
            // End game, show results (banker and player)

        // if banker == player,                             draw
        // if banker == 21 && player < 21,                  banker win 
        // if banker > player                               banker win

        // if banker has 4 cards && < 16
            // banker draw
                // if banker > 21,                          banker lose with bust
                // if banker < 21 || == 21                  banker default win

        // if banker > 16,
            // End game, show results (banker and player)


            


            // restart = Restart();

            //     if (restart == false)
            //     {
            //         return; // end program
            //     }
}
