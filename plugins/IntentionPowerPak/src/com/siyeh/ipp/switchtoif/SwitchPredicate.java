package com.siyeh.ipp.switchtoif;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiJavaToken;
import com.intellij.psi.JavaTokenType;
import com.siyeh.ipp.base.PsiElementPredicate;

class SwitchPredicate implements PsiElementPredicate
{
    public boolean satisfiedBy(PsiElement exp)
    {
        if(!(exp instanceof PsiJavaToken))
        {
            return false;
        }
        final PsiJavaToken token = (PsiJavaToken) exp;
        return token.getTokenType() == JavaTokenType.SWITCH_KEYWORD;
    }
}
