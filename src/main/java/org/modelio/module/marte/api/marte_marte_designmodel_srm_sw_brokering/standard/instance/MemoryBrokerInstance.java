/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
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
public class MemoryBrokerInstance extends SwResourceInstance {
    public static final String STEREOTYPE_NAME = "MemoryBroker_Instance";

    public static final String MEMORYBROKER_INSTANCE_ACCESSPOLICY_TAGTYPE = "MemoryBroker_Instance_accessPolicy";

    public static final String MEMORYBROKER_INSTANCE_LOCKSERVICES_TAGTYPE = "MemoryBroker_Instance_lockServices";

    public static final String MEMORYBROKER_INSTANCE_MAPSERVICES_TAGTYPE = "MemoryBroker_Instance_mapServices";

    public static final String MEMORYBROKER_INSTANCE_MEMORIES_TAGTYPE = "MemoryBroker_Instance_memories";

    public static final String MEMORYBROKER_INSTANCE_MEMORYBLOCKADRESSELEMENTS_TAGTYPE = "MemoryBroker_Instance_memoryBlockAdressElements";

    public static final String MEMORYBROKER_INSTANCE_MEMORYBLOCKSIZEELEMENTS_TAGTYPE = "MemoryBroker_Instance_memoryBlockSizeElements";

    public static final String MEMORYBROKER_INSTANCE_UNMAPSERVICES_TAGTYPE = "MemoryBroker_Instance_unMapServices";

    public static final String MEMORYBROKER_INSTANCE_UNLOCKSERVICES_TAGTYPE = "MemoryBroker_Instance_unlockServices";

    /**
     * Tells whether a {@link MemoryBrokerInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << MemoryBroker_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MemoryBrokerInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << MemoryBroker_Instance >> then instantiate a {@link MemoryBrokerInstance} proxy.
     * 
     * @return a {@link MemoryBrokerInstance} proxy on the created {@link Instance}.
     */
    public static MemoryBrokerInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MemoryBrokerInstance.STEREOTYPE_NAME);
        return MemoryBrokerInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link MemoryBrokerInstance} proxy from a {@link Instance} stereotyped << MemoryBroker_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link MemoryBrokerInstance} proxy or <i>null</i>.
     */
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
    public static MemoryBrokerInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (MemoryBrokerInstance.canInstantiate(obj))
        	return new MemoryBrokerInstance(obj);
        else
        	throw new IllegalArgumentException("MemoryBrokerInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        MemoryBrokerInstance other = (MemoryBrokerInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'MemoryBroker_Instance_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getMemoryBroker_Instance_accessPolicy() {
        return this.elt.getTagValue(MemoryBrokerInstance.MdaTypes.MEMORYBROKER_INSTANCE_ACCESSPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Instance_lockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Instance_lockServices() {
        return this.elt.getTagValues(MemoryBrokerInstance.MdaTypes.MEMORYBROKER_INSTANCE_LOCKSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Instance_mapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Instance_mapServices() {
        return this.elt.getTagValues(MemoryBrokerInstance.MdaTypes.MEMORYBROKER_INSTANCE_MAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Instance_memories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Instance_memories() {
        return this.elt.getTagValues(MemoryBrokerInstance.MdaTypes.MEMORYBROKER_INSTANCE_MEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Instance_memoryBlockAdressElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Instance_memoryBlockAdressElements() {
        return this.elt.getTagValues(MemoryBrokerInstance.MdaTypes.MEMORYBROKER_INSTANCE_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Instance_memoryBlockSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Instance_memoryBlockSizeElements() {
        return this.elt.getTagValues(MemoryBrokerInstance.MdaTypes.MEMORYBROKER_INSTANCE_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Instance_unMapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Instance_unMapServices() {
        return this.elt.getTagValues(MemoryBrokerInstance.MdaTypes.MEMORYBROKER_INSTANCE_UNMAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Instance_unlockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Instance_unlockServices() {
        return this.elt.getTagValues(MemoryBrokerInstance.MdaTypes.MEMORYBROKER_INSTANCE_UNLOCKSERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'MemoryBroker_Instance_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Instance_accessPolicy(final String value) {
        this.elt.putTagValue(MemoryBrokerInstance.MdaTypes.MEMORYBROKER_INSTANCE_ACCESSPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Instance_lockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Instance_lockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerInstance.MdaTypes.MEMORYBROKER_INSTANCE_LOCKSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Instance_mapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Instance_mapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerInstance.MdaTypes.MEMORYBROKER_INSTANCE_MAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Instance_memories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Instance_memories(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerInstance.MdaTypes.MEMORYBROKER_INSTANCE_MEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Instance_memoryBlockAdressElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Instance_memoryBlockAdressElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerInstance.MdaTypes.MEMORYBROKER_INSTANCE_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Instance_memoryBlockSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Instance_memoryBlockSizeElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerInstance.MdaTypes.MEMORYBROKER_INSTANCE_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Instance_unMapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Instance_unMapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerInstance.MdaTypes.MEMORYBROKER_INSTANCE_UNMAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Instance_unlockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Instance_unlockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerInstance.MdaTypes.MEMORYBROKER_INSTANCE_UNLOCKSERVICES_TAGTYPE_ELT, values);
    }

    protected MemoryBrokerInstance(final Instance elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType MEMORYBROKER_INSTANCE_ACCESSPOLICY_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_INSTANCE_MEMORIES_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_INSTANCE_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_INSTANCE_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_INSTANCE_LOCKSERVICES_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_INSTANCE_UNLOCKSERVICES_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_INSTANCE_MAPSERVICES_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_INSTANCE_UNMAPSERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
