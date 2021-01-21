/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement.GaCommStepModelElement;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << SaCommStep_ModelElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("978d1069-b313-4273-ab49-8ebb4d0cbde5")
public class SaCommStepModelElement extends GaCommStepModelElement {
    @objid ("d7d038e4-9295-437d-9924-6057aee86c56")
    public static final String STEREOTYPE_NAME = "SaCommStep_ModelElement";

    @objid ("9d502a13-a149-482e-abeb-08a11224848b")
    public static final String SACOMMSTEP_MODELELEMENT_DEADLINE_TAGTYPE = "SaCommStep_ModelElement_deadline";

    @objid ("13bd0e56-102f-4ed0-9624-472812293ebd")
    public static final String SACOMMSTEP_MODELELEMENT_SCHSLACK_TAGTYPE = "SaCommStep_ModelElement_schSlack";

    @objid ("d1f1bc14-f324-4f37-9621-a6f74fe89e55")
    public static final String SACOMMSTEP_MODELELEMENT_SPARECAP_TAGTYPE = "SaCommStep_ModelElement_spareCap";

    /**
     * Tells whether a {@link SaCommStepModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << SaCommStep_ModelElement >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("90474d66-1ede-4b97-acc8-441618e29246")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaCommStepModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << SaCommStep_ModelElement >> then instantiate a {@link SaCommStepModelElement} proxy.
     * 
     * @return a {@link SaCommStepModelElement} proxy on the created {@link ModelElement}.
     */
    @objid ("f317da99-e639-4d47-b978-9ad34c202888")
    public static SaCommStepModelElement create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("ModelElement");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaCommStepModelElement.STEREOTYPE_NAME);
        return SaCommStepModelElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link SaCommStepModelElement} proxy from a {@link ModelElement} stereotyped << SaCommStep_ModelElement >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link SaCommStepModelElement} proxy or <i>null</i>.
     */
    @objid ("c713cb87-6fbb-43b9-84e8-1e0c0fb5ac4d")
    public static SaCommStepModelElement instantiate(final ModelElement obj) {
        return SaCommStepModelElement.canInstantiate(obj) ? new SaCommStepModelElement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaCommStepModelElement} proxy from a {@link ModelElement} stereotyped << SaCommStep_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link SaCommStepModelElement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("dc5a4ceb-75d9-4cbc-af76-78a4657a9ce4")
    public static SaCommStepModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (SaCommStepModelElement.canInstantiate(obj))
        	return new SaCommStepModelElement(obj);
        else
        	throw new IllegalArgumentException("SaCommStepModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("77c598fe-d950-4e18-b2f9-50eca2036b04")
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
        SaCommStepModelElement other = (SaCommStepModelElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("0ccbe256-feaa-4db9-b59a-35f4d1e4b1c0")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for string property 'SaCommStep_ModelElement_deadline'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("98373576-fee3-4dc1-a490-79e93fd3634a")
    public String getSaCommStep_ModelElement_deadline() {
        return this.elt.getTagValue(SaCommStepModelElement.MdaTypes.SACOMMSTEP_MODELELEMENT_DEADLINE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaCommStep_ModelElement_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a4172b2b-4567-4402-b454-c174a130079a")
    public String getSaCommStep_ModelElement_schSlack() {
        return this.elt.getTagValue(SaCommStepModelElement.MdaTypes.SACOMMSTEP_MODELELEMENT_SCHSLACK_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaCommStep_ModelElement_spareCap'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8b4fa668-436d-4c75-a4d4-ed20a0cd5917")
    public String getSaCommStep_ModelElement_spareCap() {
        return this.elt.getTagValue(SaCommStepModelElement.MdaTypes.SACOMMSTEP_MODELELEMENT_SPARECAP_TAGTYPE_ELT);
    }

    @objid ("10fa6706-d40d-44db-89ce-2fcb6da1b8d2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'SaCommStep_ModelElement_deadline'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e5a71d86-4a72-4444-a33e-3c2b1ed64931")
    public void setSaCommStep_ModelElement_deadline(final String value) {
        this.elt.putTagValue(SaCommStepModelElement.MdaTypes.SACOMMSTEP_MODELELEMENT_DEADLINE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaCommStep_ModelElement_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("00839a7d-9ca6-44c1-bfa3-4508891232f6")
    public void setSaCommStep_ModelElement_schSlack(final String value) {
        this.elt.putTagValue(SaCommStepModelElement.MdaTypes.SACOMMSTEP_MODELELEMENT_SCHSLACK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaCommStep_ModelElement_spareCap'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("95199c40-09a8-4501-91c3-2bfc29573a2a")
    public void setSaCommStep_ModelElement_spareCap(final String value) {
        this.elt.putTagValue(SaCommStepModelElement.MdaTypes.SACOMMSTEP_MODELELEMENT_SPARECAP_TAGTYPE_ELT, value);
    }

    @objid ("08de48c2-1f19-4158-bf74-430a42807353")
    protected SaCommStepModelElement(final ModelElement elt) {
        super(elt);
    }

    @objid ("f95b846a-44a1-448c-a5c8-6291388bd96a")
    public static final class MdaTypes {
        @objid ("37c14d5c-cf51-4a94-9a88-12cada703c35")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c08a6d17-6065-4919-8bcd-5590aba39ad2")
        public static TagType SACOMMSTEP_MODELELEMENT_DEADLINE_TAGTYPE_ELT;

        @objid ("7546012e-643d-4de4-8e32-50bc7ecc0b11")
        public static TagType SACOMMSTEP_MODELELEMENT_SPARECAP_TAGTYPE_ELT;

        @objid ("26ac1ac1-0bd6-4124-892e-f8a02a2f41f3")
        public static TagType SACOMMSTEP_MODELELEMENT_SCHSLACK_TAGTYPE_ELT;

        @objid ("88b7b2d9-6618-4022-8e3b-c9ebe208f1c5")
        private static Stereotype MDAASSOCDEP;

        @objid ("80afed6b-b086-46bc-9346-05c94617065e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6d1fd353-f470-4f24-a292-747b08008cd3")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0ce4e8fb-14ac-11df-9d54-0014222a9f79");
            SACOMMSTEP_MODELELEMENT_DEADLINE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0ce4e8fc-14ac-11df-9d54-0014222a9f79");
            SACOMMSTEP_MODELELEMENT_SPARECAP_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0ce4e8fe-14ac-11df-9d54-0014222a9f79");
            SACOMMSTEP_MODELELEMENT_SCHSLACK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0ce4e8fd-14ac-11df-9d54-0014222a9f79");
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
