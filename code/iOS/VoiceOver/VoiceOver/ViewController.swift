//
//  ViewController.swift
//  VoiceOver
//
//  Created by Pieter Vandendriessche on 01/05/2019.
//  Copyright © 2019 Pieter Vandendriessche. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var likesStackView: UIStackView!
    @IBOutlet weak var petPicture: UIImageView!
    @IBOutlet weak var likeButton: UIButton!
    
    @IBOutlet weak var totalLikes: UILabel!
    @IBOutlet weak var totalLikesAmount: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
        addAccessibilityLabelToPetPicture();
        addCustomTraitAccessibilityToPetPicture();
        addHintAccessibilityToLikeButton()
        groupElementsForAccessibility()
    }

    func addAccessibilityLabelToPetPicture(){
        //Imageview is niet standaard accessible
        petPicture.isAccessibilityElement = true
        //Toekennen van een label
        petPicture.accessibilityLabel = "Schattige foto van een hond."
    }
    
    func addCustomTraitAccessibilityToPetPicture(){
        //Vertellen aan VoiceOver dat de foto ook een KNOP is.
        petPicture.accessibilityTraits.insert(UIAccessibilityTraits.button)
    }
    
    func addHintAccessibilityToLikeButton(){
       likeButton.accessibilityHint = "Hond leuk vinden."
    }
    
    func groupElementsForAccessibility(){
        likesStackView.accessibilityElements = [totalLikes, totalLikesAmount]
        likesStackView.isAccessibilityElement = true
        likesStackView.accessibilityLabel = "\(totalLikes.text!) \(totalLikesAmount.text!)"
    }
    

}

