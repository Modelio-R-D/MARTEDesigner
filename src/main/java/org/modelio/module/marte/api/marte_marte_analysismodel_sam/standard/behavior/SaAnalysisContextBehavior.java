/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.behavior;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("cc749dd4-094d-4930-ad52-b122e2086d6a")
public class SaAnalysisContextBehavior extends GaAnalysisContextBehavior {
    @objid ("fe45ac76-8e6a-4356-84af-a16f201a6205")
    public static final String STEREOTYPE_NAME = "SaAnalysisContext_Behavior";

    @objid ("71d95031-a9ac-4f2c-ba81-6063aee0f5eb")
    public static final String SAANALYSISCONTEXT_BEHAVIOR_ISSCHED_TAGTYPE = "SaAnalysisContext_Behavior_isSched";

    @objid ("ddeaae5a-150b-435f-87a9-4e473c8ced18")
    public static final String SAANALYSISCONTEXT_BEHAVIOR_OPTCRITERION_TAGTYPE = "SaAnalysisContext_Behavior_optCriterion";

    /**
     * Tells whether a {@link SaAnalysisContextBehavior proxy} can be instantiated from a {@link MObject} checking it is a {@link Behavior} stereotyped << SaAnalysisContext_Behavior >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("66f3c63b-e142-4c80-ad38-caaf3c78ffed")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Behavior) && ((Behavior) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaAnalysisContextBehavior.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Behavior} stereotyped << SaAnalysisContext_Behavior >> then instantiate a {@link SaAnalysisContextBehavior} proxy.
     * 
     * @return a {@link SaAnalysisContextBehavior} proxy on the created {@link Behavior}.
     */
    @objid ("55d52008-b3f3-44f2-9c71-3c11b3d22bd5")
    public static SaAnalysisContextBehavior create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Behavior");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaAnalysisContextBehavior.STEREOTYPE_NAME);
        return SaAnalysisContextBehavior.instantiate((Behavior)e);
    }

    /**
     * Tries to instantiate a {@link SaAnalysisContextBehavior} proxy from a {@link Behavior} stereotyped << SaAnalysisContext_Behavior >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Behavior
     * @return a {@link SaAnalysisContextBehavior} proxy or <i>null</i>.
     */
    @objid ("ca01e5c3-a3b5-4017-a130-d39652c4ae35")
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
    @objid ("912198b7-ab3f-4725-92b9-892b7d776320")
    public static SaAnalysisContextBehavior safeInstantiate(final Behavior obj) throws IllegalArgumentException {
        if (SaAnalysisContextBehavior.canInstantiate(obj))
        	return new SaAnalysisContextBehavior(obj);
        else
        	throw new IllegalArgumentException("SaAnalysisContextBehavior: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("57b18473-4013-4ec6-b9e9-eaa9a24884e3")
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
    @objid ("788211e7-3d4d-49ae-b7e8-6ee4538c7333")
    @Override
    public Behavior getElement() {
        return (Behavior)super.getElement();
    }

    /**
     * Getter for string property 'SaAnalysisContext_Behavior_optCriterion'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a025a10a-5255-40c5-9876-7efce41af30f")
    public String getSaAnalysisContext_Behavior_optCriterion() {
        return this.elt.getTagValue(SaAnalysisContextBehavior.MdaTypes.SAANALYSISCONTEXT_BEHAVIOR_OPTCRITERION_TAGTYPE_ELT);
    }

    @objid ("e5bef73a-8751-4de5-9e67-39c8b64c5fce")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaAnalysisContext_Behavior_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("490ef312-176a-413f-959e-aa3c1dba7d34")
    public boolean isSaAnalysisContext_Behavior_isSched() {
        return this.elt.isTagged(SaAnalysisContextBehavior.MdaTypes.SAANALYSISCONTEXT_BEHAVIOR_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaAnalysisContext_Behavior_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3bc23fd2-cb74-4186-bef5-2825db80347a")
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
    @objid ("bc4d4fb5-49e2-48cd-ae96-55263464ddc0")
    public void setSaAnalysisContext_Behavior_optCriterion(final String value) {
        this.elt.putTagValue(SaAnalysisContextBehavior.MdaTypes.SAANALYSISCONTEXT_BEHAVIOR_OPTCRITERION_TAGTYPE_ELT, value);
    }

    @objid ("d5743771-85f6-460e-8ee5-2f2c87957df8")
    protected SaAnalysisContextBehavior(final Behavior elt) {
        super(elt);
    }

    @objid ("43f39f1f-e5e6-4f94-807f-5cfadc33cd7e")
    public static final class MdaTypes {
        @objid ("bbd5006d-ca9c-4f01-9de6-b124d3eca6a8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a6956b39-af1f-47fa-87e7-f6848f402e33")
        public static TagType SAANALYSISCONTEXT_BEHAVIOR_ISSCHED_TAGTYPE_ELT;

        @objid ("adeda31a-4ab2-4729-bfee-4d08fe1da3bb")
        public static TagType SAANALYSISCONTEXT_BEHAVIOR_OPTCRITERION_TAGTYPE_ELT;

        @objid ("52906fad-b7ec-41aa-adf7-6ca5eb423c63")
        private static Stereotype MDAASSOCDEP;

        @objid ("f71f8c2a-50ef-4e6a-8eb7-4253b6906eee")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("45ef2571-6a53-4636-8d55-70baf6aec1c5")
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
