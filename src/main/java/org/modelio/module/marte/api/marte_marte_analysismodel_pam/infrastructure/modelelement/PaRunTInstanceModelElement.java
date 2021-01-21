/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_pam.infrastructure.modelelement;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << PaRunTInstance_ModelElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("78d12b94-dea9-4c05-8bd3-08281007db82")
public class PaRunTInstanceModelElement {
    @objid ("86a92cb8-6f36-4bbc-ac6f-ed450431401a")
    public static final String STEREOTYPE_NAME = "PaRunTInstance_ModelElement";

    @objid ("90e67480-5abb-44be-ac76-baeab5298809")
    public static final String PARUNTINSTANCE_MODELELEMENT_HOST_TAGTYPE = "PaRunTInstance_ModelElement_host";

    @objid ("5e9e3ce1-ae2b-4480-97c2-29dfc7d22c9e")
    public static final String PARUNTINSTANCE_MODELELEMENT_INSTANCE_TAGTYPE = "PaRunTInstance_ModelElement_instance";

    @objid ("ba7c4191-8875-478c-a275-628773e597c7")
    public static final String PARUNTINSTANCE_MODELELEMENT_POOLSIZE_TAGTYPE = "PaRunTInstance_ModelElement_poolSize";

    @objid ("35667e61-649a-4302-b6d3-98eb1dd1b6eb")
    public static final String PARUNTINSTANCE_MODELELEMENT_THROUGHPUT_TAGTYPE = "PaRunTInstance_ModelElement_throughput";

    @objid ("6d4580ef-24da-4e04-8395-e98e8d6a4f43")
    public static final String PARUNTINSTANCE_MODELELEMENT_UNBDDPOOL_TAGTYPE = "PaRunTInstance_ModelElement_unbddPool";

    @objid ("78dfad73-09fe-419c-87fd-ca797005161f")
    public static final String PARUNTINSTANCE_MODELELEMENT_UTILIZATION_TAGTYPE = "PaRunTInstance_ModelElement_utilization";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("fbaf004e-b9e2-4554-b112-3224465f3498")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link PaRunTInstanceModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PaRunTInstance_ModelElement >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("2a81c15d-8563-4ee7-8d7f-04c33bf9e785")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, PaRunTInstanceModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PaRunTInstance_ModelElement >> then instantiate a {@link PaRunTInstanceModelElement} proxy.
     * 
     * @return a {@link PaRunTInstanceModelElement} proxy on the created {@link ModelElement}.
     */
    @objid ("dfa46297-0f01-4722-9e2e-f0d2107fe139")
    public static PaRunTInstanceModelElement create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("ModelElement");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, PaRunTInstanceModelElement.STEREOTYPE_NAME);
        return PaRunTInstanceModelElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link PaRunTInstanceModelElement} proxy from a {@link ModelElement} stereotyped << PaRunTInstance_ModelElement >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link PaRunTInstanceModelElement} proxy or <i>null</i>.
     */
    @objid ("3b701a96-36fc-4979-827f-6e756b17ab99")
    public static PaRunTInstanceModelElement instantiate(final ModelElement obj) {
        return PaRunTInstanceModelElement.canInstantiate(obj) ? new PaRunTInstanceModelElement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PaRunTInstanceModelElement} proxy from a {@link ModelElement} stereotyped << PaRunTInstance_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link PaRunTInstanceModelElement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5a7dfa53-4df5-40fe-b668-6fcad582a19d")
    public static PaRunTInstanceModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (PaRunTInstanceModelElement.canInstantiate(obj))
        	return new PaRunTInstanceModelElement(obj);
        else
        	throw new IllegalArgumentException("PaRunTInstanceModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9aab1724-2410-4ddd-a1fb-8500bd2ef88a")
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
        PaRunTInstanceModelElement other = (PaRunTInstanceModelElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("72259e68-26fb-4e38-9f51-c75979687e22")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'PaRunTInstance_ModelElement_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f4967d09-f79d-4e1b-b455-33b824a19d00")
    public String getPaRunTInstance_ModelElement_host() {
        return this.elt.getTagValue(PaRunTInstanceModelElement.MdaTypes.PARUNTINSTANCE_MODELELEMENT_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaRunTInstance_ModelElement_instance'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9057d6d6-d1c1-4f40-8261-14624b067388")
    public String getPaRunTInstance_ModelElement_instance() {
        return this.elt.getTagValue(PaRunTInstanceModelElement.MdaTypes.PARUNTINSTANCE_MODELELEMENT_INSTANCE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaRunTInstance_ModelElement_poolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("277bf30b-9fe2-43ce-82d0-93e75da4f72e")
    public String getPaRunTInstance_ModelElement_poolSize() {
        return this.elt.getTagValue(PaRunTInstanceModelElement.MdaTypes.PARUNTINSTANCE_MODELELEMENT_POOLSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaRunTInstance_ModelElement_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ff63f0e4-dcfe-4d15-9ba5-7b37097b705b")
    public String getPaRunTInstance_ModelElement_throughput() {
        return this.elt.getTagValue(PaRunTInstanceModelElement.MdaTypes.PARUNTINSTANCE_MODELELEMENT_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaRunTInstance_ModelElement_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("00d6b6d5-07a1-4067-8dfc-6c0361ea0547")
    public String getPaRunTInstance_ModelElement_utilization() {
        return this.elt.getTagValue(PaRunTInstanceModelElement.MdaTypes.PARUNTINSTANCE_MODELELEMENT_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("2458341a-acef-4bfd-9387-0031e4eb701e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'PaRunTInstance_ModelElement_unbddPool'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b38b7146-fe94-47e6-93a3-344547edc1a0")
    public boolean isPaRunTInstance_ModelElement_unbddPool() {
        return this.elt.isTagged(PaRunTInstanceModelElement.MdaTypes.PARUNTINSTANCE_MODELELEMENT_UNBDDPOOL_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'PaRunTInstance_ModelElement_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d0f9b2bc-3425-46c8-9ea4-6f35f5e35186")
    public void setPaRunTInstance_ModelElement_host(final String value) {
        this.elt.putTagValue(PaRunTInstanceModelElement.MdaTypes.PARUNTINSTANCE_MODELELEMENT_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaRunTInstance_ModelElement_instance'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6c389fd5-2ef0-4a77-9f2f-a0589c2f50b7")
    public void setPaRunTInstance_ModelElement_instance(final String value) {
        this.elt.putTagValue(PaRunTInstanceModelElement.MdaTypes.PARUNTINSTANCE_MODELELEMENT_INSTANCE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaRunTInstance_ModelElement_poolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("94654079-a7f4-428d-8aed-1c49c9cd2e6b")
    public void setPaRunTInstance_ModelElement_poolSize(final String value) {
        this.elt.putTagValue(PaRunTInstanceModelElement.MdaTypes.PARUNTINSTANCE_MODELELEMENT_POOLSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaRunTInstance_ModelElement_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bdc2b669-a941-4e9e-aa22-05dbc7e0a603")
    public void setPaRunTInstance_ModelElement_throughput(final String value) {
        this.elt.putTagValue(PaRunTInstanceModelElement.MdaTypes.PARUNTINSTANCE_MODELELEMENT_THROUGHPUT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'PaRunTInstance_ModelElement_unbddPool'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c8a117e2-6e4f-4307-8363-450bf4ecd198")
    public void setPaRunTInstance_ModelElement_unbddPool(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(PaRunTInstanceModelElement.MdaTypes.PARUNTINSTANCE_MODELELEMENT_UNBDDPOOL_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(PaRunTInstanceModelElement.MdaTypes.PARUNTINSTANCE_MODELELEMENT_UNBDDPOOL_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'PaRunTInstance_ModelElement_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1c3494e8-c800-4397-bb9d-8fd67b7e09c3")
    public void setPaRunTInstance_ModelElement_utilization(final String value) {
        this.elt.putTagValue(PaRunTInstanceModelElement.MdaTypes.PARUNTINSTANCE_MODELELEMENT_UTILIZATION_TAGTYPE_ELT, value);
    }

    @objid ("6e669761-6e4d-4de0-9d43-00363b9bd8ff")
    protected PaRunTInstanceModelElement(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("987acc65-4548-4521-9623-c64d31a1037a")
    public static final class MdaTypes {
        @objid ("ad7f8348-3fb0-4ec2-8a0b-5e3d42593045")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("460e07ff-0cbf-4c92-a84d-029b05eab3ec")
        public static TagType PARUNTINSTANCE_MODELELEMENT_POOLSIZE_TAGTYPE_ELT;

        @objid ("81a8948c-dc22-4abe-922b-946cc11df446")
        public static TagType PARUNTINSTANCE_MODELELEMENT_UNBDDPOOL_TAGTYPE_ELT;

        @objid ("a9f0c10a-e8c9-46c2-a087-906977f2aa5e")
        public static TagType PARUNTINSTANCE_MODELELEMENT_INSTANCE_TAGTYPE_ELT;

        @objid ("ccb5f363-e1d8-4bff-8b94-67f18ffb446b")
        public static TagType PARUNTINSTANCE_MODELELEMENT_HOST_TAGTYPE_ELT;

        @objid ("15199367-3ffa-4794-b021-f7ab42b74bd2")
        public static TagType PARUNTINSTANCE_MODELELEMENT_UTILIZATION_TAGTYPE_ELT;

        @objid ("aeaf8363-cb3e-455d-bfc3-e21132281743")
        public static TagType PARUNTINSTANCE_MODELELEMENT_THROUGHPUT_TAGTYPE_ELT;

        @objid ("e596b79f-4939-4f6f-87b6-92ccb07e134e")
        private static Stereotype MDAASSOCDEP;

        @objid ("1bd9eb0f-e801-48f8-bbfa-b1f691f4fb70")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8b602a57-a41a-4e23-99c2-94078722401b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03d367ad-0ccf-11df-8525-001302895b2b");
            PARUNTINSTANCE_MODELELEMENT_POOLSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d367ae-0ccf-11df-8525-001302895b2b");
            PARUNTINSTANCE_MODELELEMENT_UNBDDPOOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d367af-0ccf-11df-8525-001302895b2b");
            PARUNTINSTANCE_MODELELEMENT_INSTANCE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d367b0-0ccf-11df-8525-001302895b2b");
            PARUNTINSTANCE_MODELELEMENT_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d367b1-0ccf-11df-8525-001302895b2b");
            PARUNTINSTANCE_MODELELEMENT_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d367b2-0ccf-11df-8525-001302895b2b");
            PARUNTINSTANCE_MODELELEMENT_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d367b3-0ccf-11df-8525-001302895b2b");
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
