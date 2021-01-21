/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_pam.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.ResourceLifeline;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << PaLogicalResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("aa56c624-a864-4a2a-9976-75de8fdc6be3")
public class PaLogicalResourceLifeline extends ResourceLifeline {
    @objid ("1d42a773-b44b-4df3-98cf-a97fc4254c43")
    public static final String STEREOTYPE_NAME = "PaLogicalResource_Lifeline";

    @objid ("fc6cca70-d03d-41f8-9c09-f3df7753e614")
    public static final String PALOGICALRESOURCE_LIFELINE_POOLSIZE_TAGTYPE = "PaLogicalResource_Lifeline_poolSize";

    @objid ("d7abd2c9-25ef-4369-9bee-284472ed2684")
    public static final String PALOGICALRESOURCE_LIFELINE_THROUGHPUT_TAGTYPE = "PaLogicalResource_Lifeline_throughput";

    @objid ("c8cbd3de-f23e-45c6-a78b-7d64a2d9e8bb")
    public static final String PALOGICALRESOURCE_LIFELINE_UTILIZATION_TAGTYPE = "PaLogicalResource_Lifeline_utilization";

    /**
     * Tells whether a {@link PaLogicalResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << PaLogicalResource_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("71fd705c-8558-4274-8ac8-f0b2a43c50c3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, PaLogicalResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << PaLogicalResource_Lifeline >> then instantiate a {@link PaLogicalResourceLifeline} proxy.
     * 
     * @return a {@link PaLogicalResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("18ec2336-8b98-446a-a2a6-a83fda2c3260")
    public static PaLogicalResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, PaLogicalResourceLifeline.STEREOTYPE_NAME);
        return PaLogicalResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link PaLogicalResourceLifeline} proxy from a {@link Lifeline} stereotyped << PaLogicalResource_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link PaLogicalResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("d64bbaa9-d176-417f-9909-0bdfbd752688")
    public static PaLogicalResourceLifeline instantiate(final Lifeline obj) {
        return PaLogicalResourceLifeline.canInstantiate(obj) ? new PaLogicalResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PaLogicalResourceLifeline} proxy from a {@link Lifeline} stereotyped << PaLogicalResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link PaLogicalResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("00f354c8-bd84-4e8f-bf31-9348d0a53e7a")
    public static PaLogicalResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (PaLogicalResourceLifeline.canInstantiate(obj))
        	return new PaLogicalResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("PaLogicalResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("09fc1a31-bdcd-4579-90e9-35fc1a2c7342")
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
        PaLogicalResourceLifeline other = (PaLogicalResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("bccc0f7b-5279-4652-9bab-90b3a7ceb7aa")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'PaLogicalResource_Lifeline_poolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7f7998d2-9323-40e4-a9a0-e99ae1da3c8b")
    public String getPaLogicalResource_Lifeline_poolSize() {
        return this.elt.getTagValue(PaLogicalResourceLifeline.MdaTypes.PALOGICALRESOURCE_LIFELINE_POOLSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaLogicalResource_Lifeline_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("974cc115-f363-468a-b60a-e6008db1dfeb")
    public String getPaLogicalResource_Lifeline_throughput() {
        return this.elt.getTagValue(PaLogicalResourceLifeline.MdaTypes.PALOGICALRESOURCE_LIFELINE_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaLogicalResource_Lifeline_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d7e1e262-6900-411e-999a-b12503c17182")
    public String getPaLogicalResource_Lifeline_utilization() {
        return this.elt.getTagValue(PaLogicalResourceLifeline.MdaTypes.PALOGICALRESOURCE_LIFELINE_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("fa8f39a5-41a7-439d-9546-f70ddcadc6fc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'PaLogicalResource_Lifeline_poolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4714222c-0548-47f6-b514-55c83345aa20")
    public void setPaLogicalResource_Lifeline_poolSize(final String value) {
        this.elt.putTagValue(PaLogicalResourceLifeline.MdaTypes.PALOGICALRESOURCE_LIFELINE_POOLSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaLogicalResource_Lifeline_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b8e368c7-ea32-4eb2-bd0d-ff2bd23feee4")
    public void setPaLogicalResource_Lifeline_throughput(final String value) {
        this.elt.putTagValue(PaLogicalResourceLifeline.MdaTypes.PALOGICALRESOURCE_LIFELINE_THROUGHPUT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaLogicalResource_Lifeline_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fcf84886-565b-4d4b-a318-3ce6c9485ae6")
    public void setPaLogicalResource_Lifeline_utilization(final String value) {
        this.elt.putTagValue(PaLogicalResourceLifeline.MdaTypes.PALOGICALRESOURCE_LIFELINE_UTILIZATION_TAGTYPE_ELT, value);
    }

    @objid ("cbb3b1f6-e2f8-4472-81d4-d04835d2e6f7")
    protected PaLogicalResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("e3d00a30-d1e4-4a66-b3d8-f234b8aacee9")
    public static final class MdaTypes {
        @objid ("51d69b67-b644-424f-bca6-73123411fb7c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5af92059-4586-40a1-a6ba-58b69c72d3a6")
        public static TagType PALOGICALRESOURCE_LIFELINE_UTILIZATION_TAGTYPE_ELT;

        @objid ("5a74b212-f903-4747-ab37-2f0cbcf2c542")
        public static TagType PALOGICALRESOURCE_LIFELINE_THROUGHPUT_TAGTYPE_ELT;

        @objid ("4c6ce18c-22f1-4f68-ab84-95bf16ccda79")
        public static TagType PALOGICALRESOURCE_LIFELINE_POOLSIZE_TAGTYPE_ELT;

        @objid ("4f367aff-05fd-480e-992d-09077d03d4e3")
        private static Stereotype MDAASSOCDEP;

        @objid ("64017618-33d4-445f-a168-535043af49b7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("aef366fe-465e-4716-9ad1-0b6c3061d5a5")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "30efbc09-14b2-11df-9d54-0014222a9f79");
            PALOGICALRESOURCE_LIFELINE_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "30efbc0a-14b2-11df-9d54-0014222a9f79");
            PALOGICALRESOURCE_LIFELINE_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "30efbc0c-14b2-11df-9d54-0014222a9f79");
            PALOGICALRESOURCE_LIFELINE_POOLSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "30efbc0b-14b2-11df-9d54-0014222a9f79");
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
