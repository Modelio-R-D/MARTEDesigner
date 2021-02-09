/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.behavior;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.behavior.GaAnalysisContextBehavior;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Behavior} with << SaAnalysisContext_Behavior >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SaAnalysisContextBehavior extends GaAnalysisContextBehavior {
    public static final String STEREOTYPE_NAME = "SaAnalysisContext_Behavior";

    public static final String SAANALYSISCONTEXT_BEHAVIOR_ISSCHED_TAGTYPE = "SaAnalysisContext_Behavior_isSched";

    public static final String SAANALYSISCONTEXT_BEHAVIOR_OPTCRITERION_TAGTYPE = "SaAnalysisContext_Behavior_optCriterion";

    /**
     * Tells whether a {@link SaAnalysisContextBehavior proxy} can be instantiated from a {@link MObject} checking it is a {@link Behavior} stereotyped << SaAnalysisContext_Behavior >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Behavior) && ((Behavior) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaAnalysisContextBehavior.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Behavior} stereotyped << SaAnalysisContext_Behavior >> then instantiate a {@link SaAnalysisContextBehavior} proxy.
     * 
     * @return a {@link SaAnalysisContextBehavior} proxy on the created {@link Behavior}.
     */
    public static SaAnalysisContextBehavior create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Behavior");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaAnalysisContextBehavior.STEREOTYPE_NAME);
        return SaAnalysisContextBehavior.instantiate((Behavior)e);
    }

    /**
     * Tries to instantiate a {@link SaAnalysisContextBehavior} proxy from a {@link Behavior} stereotyped << SaAnalysisContext_Behavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Behavior
     * @return a {@link SaAnalysisContextBehavior} proxy or <i>null</i>.
     */
    public static SaAnalysisContextBehavior instantiate(final Behavior obj) {
        return SaAnalysisContextBehavior.canInstantiate(obj) ? new SaAnalysisContextBehavior(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaAnalysisContextBehavior} proxy from a {@link Behavior} stereotyped << SaAnalysisContext_Behavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Behavior}
     * @return a {@link SaAnalysisContextBehavior} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SaAnalysisContextBehavior safeInstantiate(final Behavior obj) throws IllegalArgumentException {
        if (SaAnalysisContextBehavior.canInstantiate(obj))
        	return new SaAnalysisContextBehavior(obj);
        else
        	throw new IllegalArgumentException("SaAnalysisContextBehavior: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        SaAnalysisContextBehavior other = (SaAnalysisContextBehavior) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Behavior}. 
     * @return the Behavior represented by this proxy, never null.
     */
    @Override
    public Behavior getElement() {
        return (Behavior)super.getElement();
    }

    /**
     * Getter for string property 'SaAnalysisContext_Behavior_optCriterion'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaAnalysisContext_Behavior_optCriterion() {
        return this.elt.getTagValue(SaAnalysisContextBehavior.MdaTypes.SAANALYSISCONTEXT_BEHAVIOR_OPTCRITERION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaAnalysisContext_Behavior_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSaAnalysisContext_Behavior_isSched() {
        return this.elt.isTagged(SaAnalysisContextBehavior.MdaTypes.SAANALYSISCONTEXT_BEHAVIOR_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaAnalysisContext_Behavior_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaAnalysisContext_Behavior_isSched(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaAnalysisContextBehavior.MdaTypes.SAANALYSISCONTEXT_BEHAVIOR_ISSCHED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaAnalysisContextBehavior.MdaTypes.SAANALYSISCONTEXT_BEHAVIOR_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaAnalysisContext_Behavior_optCriterion'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaAnalysisContext_Behavior_optCriterion(final String value) {
        this.elt.putTagValue(SaAnalysisContextBehavior.MdaTypes.SAANALYSISCONTEXT_BEHAVIOR_OPTCRITERION_TAGTYPE_ELT, value);
    }

    protected SaAnalysisContextBehavior(final Behavior elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SAANALYSISCONTEXT_BEHAVIOR_ISSCHED_TAGTYPE_ELT;

        public static TagType SAANALYSISCONTEXT_BEHAVIOR_OPTCRITERION_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8383d4b3-14ab-11df-9d54-0014222a9f79");
            SAANALYSISCONTEXT_BEHAVIOR_ISSCHED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8383d4b4-14ab-11df-9d54-0014222a9f79");
            SAANALYSISCONTEXT_BEHAVIOR_OPTCRITERION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8383d4b5-14ab-11df-9d54-0014222a9f79");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
