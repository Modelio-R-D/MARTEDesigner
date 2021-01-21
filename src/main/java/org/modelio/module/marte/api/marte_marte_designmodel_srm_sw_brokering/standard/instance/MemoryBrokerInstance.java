/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.instance.SwResourceInstance;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << MemoryBroker_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b1e91e4b-84d1-4ad1-96fd-9593bdc5d4af")
public class MemoryBrokerInstance extends SwResourceInstance {
    @objid ("4ad61ee9-a97a-4c72-b0e2-b4ec613f98c2")
    public static final String STEREOTYPE_NAME = "MemoryBroker_Instance";

    @objid ("9c330a4d-34e1-4dab-89b1-e70b1f38650d")
    public static final String MEMORYBROKER_INSTANCE_ACCESSPOLICY_TAGTYPE = "MemoryBroker_Instance_accessPolicy";

    @objid ("ac7f7455-52a6-4151-95de-5955240bb1b3")
    public static final String MEMORYBROKER_INSTANCE_LOCKSERVICES_TAGTYPE = "MemoryBroker_Instance_lockServices";

    @objid ("0fabdbe0-43b9-4bdf-a74c-a4290c8f524c")
    public static final String MEMORYBROKER_INSTANCE_MAPSERVICES_TAGTYPE = "MemoryBroker_Instance_mapServices";

    @objid ("d0db879e-3b99-4060-9af5-697477abd907")
    public static final String MEMORYBROKER_INSTANCE_MEMORIES_TAGTYPE = "MemoryBroker_Instance_memories";

    @objid ("41bb1b8e-bcee-454d-aa9b-48bf76fb8b60")
    public static final String MEMORYBROKER_INSTANCE_MEMORYBLOCKADRESSELEMENTS_TAGTYPE = "MemoryBroker_Instance_memoryBlockAdressElements";

    @objid ("c955d01e-905f-499b-bab5-2bd0770d11aa")
    public static final String MEMORYBROKER_INSTANCE_MEMORYBLOCKSIZEELEMENTS_TAGTYPE = "MemoryBroker_Instance_memoryBlockSizeElements";

    @objid ("609cac67-0b9d-4ca4-986f-79c8fe4b1cfb")
    public static final String MEMORYBROKER_INSTANCE_UNMAPSERVICES_TAGTYPE = "MemoryBroker_Instance_unMapServices";

    @objid ("ed348881-f3c5-41bb-9959-310fb4c55df4")
    public static final String MEMORYBROKER_INSTANCE_UNLOCKSERVICES_TAGTYPE = "MemoryBroker_Instance_unlockServices";

    /**
     * Tells whether a {@link MemoryBrokerInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << MemoryBroker_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("a36f1b26-3034-4a10-92dd-d1e995a16981")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MemoryBrokerInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << MemoryBroker_Instance >> then instantiate a {@link MemoryBrokerInstance} proxy.
     * 
     * @return a {@link MemoryBrokerInstance} proxy on the created {@link Instance}.
     */
    @objid ("30c7326a-e7e8-45a7-829f-9a8b0d260729")
    public static MemoryBrokerInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MemoryBrokerInstance.STEREOTYPE_NAME);
        return MemoryBrokerInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link MemoryBrokerInstance} proxy from a {@link Instance} stereotyped << MemoryBroker_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link MemoryBrokerInstance} proxy or <i>null</i>.
     */
    @objid ("d07ab764-0a19-4800-a96f-f0a28690a167")
    public static MemoryBrokerInstance instantiate(final Instance obj) {
        return MemoryBrokerInstance.canInstantiate(obj) ? new MemoryBrokerInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MemoryBrokerInstance} proxy from a {@link Instance} stereotyped << MemoryBroker_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link MemoryBrokerInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b45ef657-7de9-4f33-b686-a5645b9c5697")
    public static MemoryBrokerInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (MemoryBrokerInstance.canInstantiate(obj))
        	return new MemoryBrokerInstance(obj);
        else
        	throw new IllegalArgumentException("MemoryBrokerInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("56a16ced-6e43-40a1-a17a-4767772ba9b1")
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
        MemoryBrokerInstance other = (MemoryBrokerInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("345ece37-9578-4434-9ee5-df74b912723d")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'MemoryBroker_Instance_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("de0c2b51-cd56-497b-b837-b49dddebc6be")
    public String getMemoryBroker_Instance_accessPolicy() {
        return this.elt.getTagValue(MemoryBrokerInstance.MdaTypes.MEMORYBROKER_INSTANCE_ACCESSPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Instance_lockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5b373ad0-b499-4265-b749-1b9be84e7869")
    public List<String> getMemoryBroker_Instance_lockServices() {
        return this.elt.getTagValues(MemoryBrokerInstance.MdaTypes.MEMORYBROKER_INSTANCE_LOCKSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Instance_mapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d4965bf0-9a48-470b-90e9-70b7848b12ff")
    public List<String> getMemoryBroker_Instance_mapServices() {
        return this.elt.getTagValues(MemoryBrokerInstance.MdaTypes.MEMORYBROKER_INSTANCE_MAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Instance_memories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("67e820f6-8005-41e8-9210-cad921a3990e")
    public List<String> getMemoryBroker_Instance_memories() {
        return this.elt.getTagValues(MemoryBrokerInstance.MdaTypes.MEMORYBROKER_INSTANCE_MEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Instance_memoryBlockAdressElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1eaa33d6-f87c-4271-974e-9133fff4a15f")
    public List<String> getMemoryBroker_Instance_memoryBlockAdressElements() {
        return this.elt.getTagValues(MemoryBrokerInstance.MdaTypes.MEMORYBROKER_INSTANCE_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Instance_memoryBlockSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("35524e14-5d89-4456-892a-936b5ec29185")
    public List<String> getMemoryBroker_Instance_memoryBlockSizeElements() {
        return this.elt.getTagValues(MemoryBrokerInstance.MdaTypes.MEMORYBROKER_INSTANCE_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Instance_unMapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9a471df8-7077-40b6-8f9f-70ec132bbb7a")
    public List<String> getMemoryBroker_Instance_unMapServices() {
        return this.elt.getTagValues(MemoryBrokerInstance.MdaTypes.MEMORYBROKER_INSTANCE_UNMAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Instance_unlockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c001dba7-fd1a-4ece-8b9e-7965d37521fe")
    public List<String> getMemoryBroker_Instance_unlockServices() {
        return this.elt.getTagValues(MemoryBrokerInstance.MdaTypes.MEMORYBROKER_INSTANCE_UNLOCKSERVICES_TAGTYPE_ELT);
    }

    @objid ("8f2821e9-c0e8-4e53-aa8e-5635e19642e6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'MemoryBroker_Instance_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b4c02b09-1216-44fd-b4a5-640611930aff")
    public void setMemoryBroker_Instance_accessPolicy(final String value) {
        this.elt.putTagValue(MemoryBrokerInstance.MdaTypes.MEMORYBROKER_INSTANCE_ACCESSPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Instance_lockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("67609945-b566-4feb-88d0-2342456f6cf1")
    public void setMemoryBroker_Instance_lockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerInstance.MdaTypes.MEMORYBROKER_INSTANCE_LOCKSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Instance_mapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b2dc5f44-766f-4090-a12a-1dcced189faa")
    public void setMemoryBroker_Instance_mapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerInstance.MdaTypes.MEMORYBROKER_INSTANCE_MAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Instance_memories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d0146484-a121-4f3b-9465-ebfc2fd1c197")
    public void setMemoryBroker_Instance_memories(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerInstance.MdaTypes.MEMORYBROKER_INSTANCE_MEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Instance_memoryBlockAdressElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1f1df321-109e-40c4-be96-1273b9f3f495")
    public void setMemoryBroker_Instance_memoryBlockAdressElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerInstance.MdaTypes.MEMORYBROKER_INSTANCE_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Instance_memoryBlockSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e19a7ec5-d022-49ae-b1f7-e3e7e4a54bd2")
    public void setMemoryBroker_Instance_memoryBlockSizeElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerInstance.MdaTypes.MEMORYBROKER_INSTANCE_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Instance_unMapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4ae96cc3-a25c-4bdb-86d7-53c564838094")
    public void setMemoryBroker_Instance_unMapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerInstance.MdaTypes.MEMORYBROKER_INSTANCE_UNMAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Instance_unlockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6edcf319-cf45-4708-8640-083effa134bc")
    public void setMemoryBroker_Instance_unlockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerInstance.MdaTypes.MEMORYBROKER_INSTANCE_UNLOCKSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("dc3cb5d8-d605-46c3-ab98-648dd9f798be")
    protected MemoryBrokerInstance(final Instance elt) {
        super(elt);
    }

    @objid ("4def27f9-1b55-4670-bbbb-6f2eb9b6b523")
    public static final class MdaTypes {
        @objid ("03942ca2-7298-4a10-aeff-1a912fd88cdb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7238d17d-0358-4a1e-b600-d5642dfada4f")
        public static TagType MEMORYBROKER_INSTANCE_ACCESSPOLICY_TAGTYPE_ELT;

        @objid ("b5884262-13dc-44e2-8617-b97d5eb2aa5b")
        public static TagType MEMORYBROKER_INSTANCE_MEMORIES_TAGTYPE_ELT;

        @objid ("e6e2b737-169b-4adf-93a7-ec37a1ed9d75")
        public static TagType MEMORYBROKER_INSTANCE_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT;

        @objid ("cc847ba2-7446-402c-a703-0411eed1a804")
        public static TagType MEMORYBROKER_INSTANCE_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT;

        @objid ("19ef9043-ade1-47d8-b76b-a999c02fc792")
        public static TagType MEMORYBROKER_INSTANCE_LOCKSERVICES_TAGTYPE_ELT;

        @objid ("0d090a84-49a1-4011-a503-f1ba6c4b60b6")
        public static TagType MEMORYBROKER_INSTANCE_UNLOCKSERVICES_TAGTYPE_ELT;

        @objid ("2146baff-e85f-47c4-b194-739e6742af0e")
        public static TagType MEMORYBROKER_INSTANCE_MAPSERVICES_TAGTYPE_ELT;

        @objid ("48a1f3de-d1ba-4869-9bd1-33f21035bb73")
        public static TagType MEMORYBROKER_INSTANCE_UNMAPSERVICES_TAGTYPE_ELT;

        @objid ("2a40761e-abb2-43cc-8d3e-eae41b993858")
        private static Stereotype MDAASSOCDEP;

        @objid ("77e27517-c2f1-45a7-a72d-de54c04dbeb5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("47ac5fc1-7853-4d60-8a0a-11722a03ee58")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0204e583-0ccf-11df-8525-001302895b2b");
            MEMORYBROKER_INSTANCE_ACCESSPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5e0dc0dc-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_INSTANCE_MEMORIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5e0dc0db-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_INSTANCE_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5e0dc0da-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_INSTANCE_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5e0dc0d9-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_INSTANCE_LOCKSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5e0dc0d8-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_INSTANCE_UNLOCKSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5e0dc0d7-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_INSTANCE_MAPSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5e0dc0d6-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_INSTANCE_UNMAPSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5e0dc0d5-172e-11df-b92a-0014222a9f79");
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
