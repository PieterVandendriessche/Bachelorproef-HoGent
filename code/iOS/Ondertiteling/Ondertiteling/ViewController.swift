//
//  ViewController.swift
//  Ondertiteling
//
//  Created by Pieter Vandendriessche on 01/05/2019.
//  Copyright © 2019 Pieter Vandendriessche. All rights reserved.
//

import UIKit
import AVKit
import AVFoundation

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
        let videoURL = URL(string: "https://devstreaming-cdn.apple.com/videos/streaming/examples/img_bipbop_adv_example_ts/master.m3u8")
        let player = AVPlayer(url: videoURL!)
        let playerLayer = AVPlayerLayer(player: player)
        playerLayer.frame = self.view.bounds
        self.view.layer.addSublayer(playerLayer)
        player.play()
        player.isClosedCaptionDisplayEnabled = true
        
        UIAccessibility.isSwitchControlRunning
    }


}

