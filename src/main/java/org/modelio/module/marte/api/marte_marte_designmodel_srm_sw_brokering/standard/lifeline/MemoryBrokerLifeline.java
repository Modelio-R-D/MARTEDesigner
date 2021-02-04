/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.lifeline;

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
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.lifeline.SwResourceLifeline;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << MemoryBroker_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("7cccbe4d-a100-4963-8605-8022d7f47156")
public class MemoryBrokerLifeline extends SwResourceLifeline {
    @objid ("f91f0f51-30ae-4527-a21e-e9291de25cae")
    public static final String STEREOTYPE_NAME = "MemoryBroker_Lifeline";

    @objid ("1b78a9f3-236a-43ac-8d2d-cb257f426f02")
    public static final String MEMORYBROKER_LIFELINE_ACCESSPOLICY_TAGTYPE = "MemoryBroker_Lifeline_accessPolicy";

    @objid ("0649aa22-9771-40bb-a777-d91264568ae6")
    public static final String MEMORYBROKER_LIFELINE_LOCKSERVICES_TAGTYPE = "MemoryBroker_Lifeline_lockServices";

    @objid ("cffce7b1-f4da-4b7c-87cd-0da92f388d60")
    public static final String MEMORYBROKER_LIFELINE_MAPSERVICES_TAGTYPE = "MemoryBroker_Lifeline_mapServices";

    @objid ("f7783b8b-5ef1-40d6-b444-8c02e827504b")
    public static final String MEMORYBROKER_LIFELINE_MEMORIES_TAGTYPE = "MemoryBroker_Lifeline_memories";

    @objid ("1fbbd431-ceda-4964-aff7-e1cec67ae06c")
    public static final String MEMORYBROKER_LIFELINE_MEMORYBLOCKADRESSELEMENTS_TAGTYPE = "MemoryBroker_Lifeline_memoryBlockAdressElements";

    @objid ("52c473de-a4ce-41b4-98f4-c043a0fde366")
    public static final String MEMORYBROKER_LIFELINE_MEMORYBLOCKSIZEELEMENTS_TAGTYPE = "MemoryBroker_Lifeline_memoryBlockSizeElements";

    @objid ("d15a4a3b-3e15-4f4f-a71a-731b9241222a")
    public static final String MEMORYBROKER_LIFELINE_UNMAPSERVICES_TAGTYPE = "MemoryBroker_Lifeline_unMapServices";

    @objid ("fa0057a8-b554-48d4-9f41-3bb1ab20c07f")
    public static final String MEMORYBROKER_LIFELINE_UNLOCKSERVICES_TAGTYPE = "MemoryBroker_Lifeline_unlockServices";

    /**
     * Tells whether a {@link MemoryBrokerLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << MemoryBroker_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0d5f37a1-681a-4bcb-b922-29e00e4df7a2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MemoryBrokerLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << MemoryBroker_Lifeline >> then instantiate a {@link MemoryBrokerLifeline} proxy.
     * 
     * @return a {@link MemoryBrokerLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("d011cc30-1098-4e0a-8a3f-647893d5c836")
    public static MemoryBrokerLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MemoryBrokerLifeline.STEREOTYPE_NAME);
        return MemoryBrokerLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link MemoryBrokerLifeline} proxy from a {@link Lifeline} stereotyped << MemoryBroker_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link MemoryBrokerLifeline} proxy or <i>null</i>.
     */
    @objid ("8559701f-cc43-462a-bba6-3e4b74c99ebd")
    public static MemoryBrokerLifeline instantiate(final Lifeline obj) {
        return MemoryBrokerLifeline.canInstantiate(obj) ? new MemoryBrokerLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MemoryBrokerLifeline} proxy from a {@link Lifeline} stereotyped << MemoryBroker_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link MemoryBrokerLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("59d7526a-e4cb-4050-9675-fa0d38f221e3")
    public static MemoryBrokerLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (MemoryBrokerLifeline.canInstantiate(obj))
        	return new MemoryBrokerLifeline(obj);
        else
        	throw new IllegalArgumentException("MemoryBrokerLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("de136c5e-cbbe-41d2-9b2b-442e068971ff")
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
        MemoryBrokerLifeline other = (MemoryBrokerLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("440df44d-5b8b-4e11-ba60-ea9dd22e356d")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'MemoryBroker_Lifeline_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("22656187-fe76-4374-adbd-9cb4a95e5948")
    public String getMemoryBroker_Lifeline_accessPolicy() {
        return this.elt.getTagValue(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_ACCESSPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Lifeline_lockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("88876a8b-20f9-44cd-8a0b-a77d15680ed6")
    public List<String> getMemoryBroker_Lifeline_lockServices() {
        return this.elt.getTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_LOCKSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Lifeline_mapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6fb55585-b40d-4034-a6aa-455fd7862889")
    public List<String> getMemoryBroker_Lifeline_mapServices() {
        return this.elt.getTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_MAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Lifeline_memories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1dedc1f6-2f07-4a98-8c7d-599fe251c2b8")
    public List<String> getMemoryBroker_Lifeline_memories() {
        return this.elt.getTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_MEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Lifeline_memoryBlockAdressElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("365d80a2-0ce3-4bf0-b0df-1a90639d154c")
    public List<String> getMemoryBroker_Lifeline_memoryBlockAdressElements() {
        return this.elt.getTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Lifeline_memoryBlockSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2afa7138-f74d-43da-945b-00969f83f08d")
    public List<String> getMemoryBroker_Lifeline_memoryBlockSizeElements() {
        return this.elt.getTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Lifeline_unMapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0bbaae2e-d320-4b9f-a435-d8921fcea950")
    public List<String> getMemoryBroker_Lifeline_unMapServices() {
        return this.elt.getTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_UNMAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Lifeline_unlockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("66ec7a64-6ef7-4d48-9084-07fa2865bc41")
    public List<String> getMemoryBroker_Lifeline_unlockServices() {
        return this.elt.getTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_UNLOCKSERVICES_TAGTYPE_ELT);
    }

    @objid ("43ec2e16-d06f-4503-a6b8-5d3f10b0fc9f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'MemoryBroker_Lifeline_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d131192f-ba7f-4a46-9277-9656ff24bcac")
    public void setMemoryBroker_Lifeline_accessPolicy(final String value) {
        this.elt.putTagValue(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_ACCESSPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Lifeline_lockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("edcfcc99-e039-45d1-b8bc-ee1abec15b09")
    public void setMemoryBroker_Lifeline_lockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_LOCKSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Lifeline_mapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0d4dea08-cccc-4adb-a0d6-1b47478ba38a")
    public void setMemoryBroker_Lifeline_mapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_MAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Lifeline_memories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a8caa74c-00ef-41bc-b7a6-8987c3d1c527")
    public void setMemoryBroker_Lifeline_memories(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_MEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Lifeline_memoryBlockAdressElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7975343c-7c52-46e5-86ce-9cf998addfcc")
    public void setMemoryBroker_Lifeline_memoryBlockAdressElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Lifeline_memoryBlockSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6a9dad99-7936-4fac-b1c7-7927e65ff6a1")
    public void setMemoryBroker_Lifeline_memoryBlockSizeElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Lifeline_unMapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8b91a708-b714-4e85-8a3a-8f9203c402df")
    public void setMemoryBroker_Lifeline_unMapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_UNMAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Lifeline_unlockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("abf88630-8749-4cfd-8bdc-9fd9711cb542")
    public void setMemoryBroker_Lifeline_unlockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_UNLOCKSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("07637b48-cd21-4d71-bd3c-0592ff47a2cd")
    protected MemoryBrokerLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("7ef5fbd7-b439-491f-b544-74c14f7a0ac6")
    public static final class MdaTypes {
        @objid ("837a444b-ed38-4ccb-87b9-b384ba46c4d7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("97fcd033-f2d1-4c18-b648-c3daabaacd89")
        public static TagType MEMORYBROKER_LIFELINE_ACCESSPOLICY_TAGTYPE_ELT;

        @objid ("99948b01-5acd-43cc-86db-97c1e0b722d6")
        public static TagType MEMORYBROKER_LIFELINE_MEMORIES_TAGTYPE_ELT;

        @objid ("fee6e112-1f0a-49b3-8693-311a8f167a47")
        public static TagType MEMORYBROKER_LIFELINE_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT;

        @objid ("139c17ed-13ef-403f-a19b-5eb21e75584d")
        public static TagType MEMORYBROKER_LIFELINE_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT;

        @objid ("4c0eba16-5b3c-4571-90f0-097a74f264fa")
        public static TagType MEMORYBROKER_LIFELINE_LOCKSERVICES_TAGTYPE_ELT;

        @objid ("d45d645a-45b8-4f1e-be9d-3201fc9b46cb")
        public static TagType MEMORYBROKER_LIFELINE_UNLOCKSERVICES_TAGTYPE_ELT;

        @objid ("a319e7ea-6225-4d25-a85a-bb2f9a935b8a")
        public static TagType MEMORYBROKER_LIFELINE_MAPSERVICES_TAGTYPE_ELT;

        @objid ("091c74db-90b5-42b6-93b4-1c27f10d738f")
        public static TagType MEMORYBROKER_LIFELINE_UNMAPSERVICES_TAGTYPE_ELT;

        @objid ("bfec7bf1-a3ab-478a-ba14-e585083d8bc7")
        private static Stereotype MDAASSOCDEP;

        @objid ("1cd58658-1bfd-4679-a8be-541a6ac2ac53")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a8f5f735-d4aa-413f-b3e6-ccb66a544837")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "4b40ae43-10d2-11df-81d9-0014222a9f79");
            MEMORYBROKER_LIFELINE_ACCESSPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5c655ce4-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_LIFELINE_MEMORIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5c655ce3-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_LIFELINE_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5c655ce2-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_LIFELINE_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5c655ce1-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_LIFELINE_LOCKSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5c655ce0-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_LIFELINE_UNLOCKSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5c655cdf-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_LIFELINE_MAPSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5c655cde-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_LIFELINE_UNMAPSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5c655cdd-172e-11df-b92a-0014222a9f79");
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
