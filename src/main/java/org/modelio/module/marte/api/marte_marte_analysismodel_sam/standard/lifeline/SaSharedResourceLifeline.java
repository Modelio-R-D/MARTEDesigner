/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.MutualExclusionResourceLifeline;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << SaSharedResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("9fde3b6f-aa9d-48b1-9eb4-fea894cc84a7")
public class SaSharedResourceLifeline extends MutualExclusionResourceLifeline {
    @objid ("081d6fd6-ed79-4fa9-a800-45cdf461b2ec")
    public static final String STEREOTYPE_NAME = "SaSharedResource_Lifeline";

    @objid ("959803f2-bbbe-46be-965f-d4033ce0e269")
    public static final String SASHAREDRESOURCE_LIFELINE_ACQUIST_TAGTYPE = "SaSharedResource_Lifeline_acquisT";

    @objid ("83620e5f-eb22-4174-9f98-defb8039374a")
    public static final String SASHAREDRESOURCE_LIFELINE_CAPACITY_TAGTYPE = "SaSharedResource_Lifeline_capacity";

    @objid ("dfc5f02d-e026-44d2-b12b-718d9155e0ec")
    public static final String SASHAREDRESOURCE_LIFELINE_ISCONSUM_TAGTYPE = "SaSharedResource_Lifeline_isConsum";

    @objid ("51772dd5-f0a0-4f3f-9901-04185090151d")
    public static final String SASHAREDRESOURCE_LIFELINE_ISPREEMP_TAGTYPE = "SaSharedResource_Lifeline_isPreemp";

    @objid ("f8271169-774f-48aa-99af-2e58914357b6")
    public static final String SASHAREDRESOURCE_LIFELINE_RELEASET_TAGTYPE = "SaSharedResource_Lifeline_releaseT";

    /**
     * Tells whether a {@link SaSharedResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << SaSharedResource_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("1cb4e67e-0f72-47ee-8089-ed7748d34001")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaSharedResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << SaSharedResource_Lifeline >> then instantiate a {@link SaSharedResourceLifeline} proxy.
     * 
     * @return a {@link SaSharedResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("aa930938-8eb2-4f96-9150-0ed364a1607b")
    public static SaSharedResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaSharedResourceLifeline.STEREOTYPE_NAME);
        return SaSharedResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link SaSharedResourceLifeline} proxy from a {@link Lifeline} stereotyped << SaSharedResource_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link SaSharedResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("445d6a9b-d02d-433c-81d8-2a7b2b92de83")
    public static SaSharedResourceLifeline instantiate(final Lifeline obj) {
        return SaSharedResourceLifeline.canInstantiate(obj) ? new SaSharedResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaSharedResourceLifeline} proxy from a {@link Lifeline} stereotyped << SaSharedResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link SaSharedResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6a0a52f2-4f4a-4c52-b3c8-c6d491688770")
    public static SaSharedResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (SaSharedResourceLifeline.canInstantiate(obj))
        	return new SaSharedResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("SaSharedResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("69a3fd9a-59c0-4fce-9c1b-457dc7d5cdca")
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
        SaSharedResourceLifeline other = (SaSharedResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("bed68746-2ef8-4b1c-8464-f281d5e067d8")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for List<String> property 'SaSharedResource_Lifeline_acquisT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5bdb0ae8-bfb6-4754-b83e-0b2dd657f4f3")
    public List<String> getSaSharedResource_Lifeline_acquisT() {
        return this.elt.getTagValues(SaSharedResourceLifeline.MdaTypes.SASHAREDRESOURCE_LIFELINE_ACQUIST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaSharedResource_Lifeline_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bcf18048-0a1b-4f07-9d9a-ec8203cba421")
    public String getSaSharedResource_Lifeline_capacity() {
        return this.elt.getTagValue(SaSharedResourceLifeline.MdaTypes.SASHAREDRESOURCE_LIFELINE_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SaSharedResource_Lifeline_releaseT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ba6fc14e-6dd4-4568-a7ae-f0813cd6e1d4")
    public List<String> getSaSharedResource_Lifeline_releaseT() {
        return this.elt.getTagValues(SaSharedResourceLifeline.MdaTypes.SASHAREDRESOURCE_LIFELINE_RELEASET_TAGTYPE_ELT);
    }

    @objid ("5146b721-8cac-4bf4-8c6e-3754232d50dd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaSharedResource_Lifeline_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("55973a00-9187-4b45-b40b-e58935ee1f19")
    public boolean isSaSharedResource_Lifeline_isConsum() {
        return this.elt.isTagged(SaSharedResourceLifeline.MdaTypes.SASHAREDRESOURCE_LIFELINE_ISCONSUM_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SaSharedResource_Lifeline_isPreemp'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9e984edd-fa9a-4043-9736-d987114a1c54")
    public boolean isSaSharedResource_Lifeline_isPreemp() {
        return this.elt.isTagged(SaSharedResourceLifeline.MdaTypes.SASHAREDRESOURCE_LIFELINE_ISPREEMP_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SaSharedResource_Lifeline_acquisT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("42b41388-1271-4cc6-851c-4e006412ab6d")
    public void setSaSharedResource_Lifeline_acquisT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceLifeline.MdaTypes.SASHAREDRESOURCE_LIFELINE_ACQUIST_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SaSharedResource_Lifeline_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("16dddf80-da7b-4d66-a132-3e24905f20c5")
    public void setSaSharedResource_Lifeline_capacity(final String value) {
        this.elt.putTagValue(SaSharedResourceLifeline.MdaTypes.SASHAREDRESOURCE_LIFELINE_CAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SaSharedResource_Lifeline_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6a3d7c0a-b0c3-4929-a75b-5a3af9d8e6e5")
    public void setSaSharedResource_Lifeline_isConsum(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaSharedResourceLifeline.MdaTypes.SASHAREDRESOURCE_LIFELINE_ISCONSUM_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaSharedResourceLifeline.MdaTypes.SASHAREDRESOURCE_LIFELINE_ISCONSUM_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaSharedResource_Lifeline_isPreemp'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("420081cd-100a-4862-941d-02928e0a5e4d")
    public void setSaSharedResource_Lifeline_isPreemp(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaSharedResourceLifeline.MdaTypes.SASHAREDRESOURCE_LIFELINE_ISPREEMP_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaSharedResourceLifeline.MdaTypes.SASHAREDRESOURCE_LIFELINE_ISPREEMP_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SaSharedResource_Lifeline_releaseT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("53af207b-5106-498f-8fc1-77cfa897a9ca")
    public void setSaSharedResource_Lifeline_releaseT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceLifeline.MdaTypes.SASHAREDRESOURCE_LIFELINE_RELEASET_TAGTYPE_ELT, values);
    }

    @objid ("0db4e980-90b3-4e23-a61b-347fffe77242")
    protected SaSharedResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("745dfee7-c423-44aa-be14-3f21fa0fb9f4")
    public static final class MdaTypes {
        @objid ("941b3305-2e6e-4957-9ad1-e517e2cb5c36")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d65b6faa-8974-4ca4-a874-0222872a1b63")
        public static TagType SASHAREDRESOURCE_LIFELINE_CAPACITY_TAGTYPE_ELT;

        @objid ("70e70bb6-2108-45b9-87c7-156a836ba047")
        public static TagType SASHAREDRESOURCE_LIFELINE_ISPREEMP_TAGTYPE_ELT;

        @objid ("64ea92ab-8c4d-4cb1-82c4-44c832d5e6e4")
        public static TagType SASHAREDRESOURCE_LIFELINE_ISCONSUM_TAGTYPE_ELT;

        @objid ("1089ca68-ee1b-4c16-84d5-6a44f55a0c69")
        public static TagType SASHAREDRESOURCE_LIFELINE_ACQUIST_TAGTYPE_ELT;

        @objid ("c6ae7fbe-b831-4b3f-a4c1-6a17dcd81501")
        public static TagType SASHAREDRESOURCE_LIFELINE_RELEASET_TAGTYPE_ELT;

        @objid ("badd47c8-d815-4613-a434-83fe01626106")
        private static Stereotype MDAASSOCDEP;

        @objid ("39b987da-d895-417a-9d84-1c3820b5f024")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5b6405aa-a244-44fe-925b-437776071ada")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "782f4c07-14ad-11df-9d54-0014222a9f79");
            SASHAREDRESOURCE_LIFELINE_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "782f4c0a-14ad-11df-9d54-0014222a9f79");
            SASHAREDRESOURCE_LIFELINE_ISPREEMP_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "782f4c0b-14ad-11df-9d54-0014222a9f79");
            SASHAREDRESOURCE_LIFELINE_ISCONSUM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "782f4c0c-14ad-11df-9d54-0014222a9f79");
            SASHAREDRESOURCE_LIFELINE_ACQUIST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "782f4c0d-14ad-11df-9d54-0014222a9f79");
            SASHAREDRESOURCE_LIFELINE_RELEASET_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "782f4c08-14ad-11df-9d54-0014222a9f79");
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
