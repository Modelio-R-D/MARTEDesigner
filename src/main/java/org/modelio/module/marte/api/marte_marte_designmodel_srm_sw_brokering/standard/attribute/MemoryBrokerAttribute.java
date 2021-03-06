/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.attribute.SwResourceAttribute;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << MemoryBroker_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class MemoryBrokerAttribute extends SwResourceAttribute {
    public static final String STEREOTYPE_NAME = "MemoryBroker_Attribute";

    public static final String MEMORYBROKER_ATTRIBUTE_ACCESSPOLICY_TAGTYPE = "MemoryBroker_Attribute_accessPolicy";

    public static final String MEMORYBROKER_ATTRIBUTE_LOCKSERVICES_TAGTYPE = "MemoryBroker_Attribute_lockServices";

    public static final String MEMORYBROKER_ATTRIBUTE_MAPSERVICES_TAGTYPE = "MemoryBroker_Attribute_mapServices";

    public static final String MEMORYBROKER_ATTRIBUTE_MEMORIES_TAGTYPE = "MemoryBroker_Attribute_memories";

    public static final String MEMORYBROKER_ATTRIBUTE_MEMORYBLOCKADRESSELEMENTS_TAGTYPE = "MemoryBroker_Attribute_memoryBlockAdressElements";

    public static final String MEMORYBROKER_ATTRIBUTE_MEMORYBLOCKSIZEELEMENTS_TAGTYPE = "MemoryBroker_Attribute_memoryBlockSizeElements";

    public static final String MEMORYBROKER_ATTRIBUTE_UNMAPSERVICES_TAGTYPE = "MemoryBroker_Attribute_unMapServices";

    public static final String MEMORYBROKER_ATTRIBUTE_UNLOCKSERVICES_TAGTYPE = "MemoryBroker_Attribute_unlockServices";

    /**
     * Tells whether a {@link MemoryBrokerAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << MemoryBroker_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MemoryBrokerAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << MemoryBroker_Attribute >> then instantiate a {@link MemoryBrokerAttribute} proxy.
     * 
     * @return a {@link MemoryBrokerAttribute} proxy on the created {@link Attribute}.
     */
    public static MemoryBrokerAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MemoryBrokerAttribute.STEREOTYPE_NAME);
        return MemoryBrokerAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link MemoryBrokerAttribute} proxy from a {@link Attribute} stereotyped << MemoryBroker_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link MemoryBrokerAttribute} proxy or <i>null</i>.
     */
    public static MemoryBrokerAttribute instantiate(final Attribute obj) {
        return MemoryBrokerAttribute.canInstantiate(obj) ? new MemoryBrokerAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MemoryBrokerAttribute} proxy from a {@link Attribute} stereotyped << MemoryBroker_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link MemoryBrokerAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static MemoryBrokerAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (MemoryBrokerAttribute.canInstantiate(obj))
        	return new MemoryBrokerAttribute(obj);
        else
        	throw new IllegalArgumentException("MemoryBrokerAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        MemoryBrokerAttribute other = (MemoryBrokerAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'MemoryBroker_Attribute_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getMemoryBroker_Attribute_accessPolicy() {
        return this.elt.getTagValue(MemoryBrokerAttribute.MdaTypes.MEMORYBROKER_ATTRIBUTE_ACCESSPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Attribute_lockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Attribute_lockServices() {
        return this.elt.getTagValues(MemoryBrokerAttribute.MdaTypes.MEMORYBROKER_ATTRIBUTE_LOCKSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Attribute_mapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Attribute_mapServices() {
        return this.elt.getTagValues(MemoryBrokerAttribute.MdaTypes.MEMORYBROKER_ATTRIBUTE_MAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Attribute_memories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Attribute_memories() {
        return this.elt.getTagValues(MemoryBrokerAttribute.MdaTypes.MEMORYBROKER_ATTRIBUTE_MEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Attribute_memoryBlockAdressElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Attribute_memoryBlockAdressElements() {
        return this.elt.getTagValues(MemoryBrokerAttribute.MdaTypes.MEMORYBROKER_ATTRIBUTE_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Attribute_memoryBlockSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Attribute_memoryBlockSizeElements() {
        return this.elt.getTagValues(MemoryBrokerAttribute.MdaTypes.MEMORYBROKER_ATTRIBUTE_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Attribute_unMapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Attribute_unMapServices() {
        return this.elt.getTagValues(MemoryBrokerAttribute.MdaTypes.MEMORYBROKER_ATTRIBUTE_UNMAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Attribute_unlockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Attribute_unlockServices() {
        return this.elt.getTagValues(MemoryBrokerAttribute.MdaTypes.MEMORYBROKER_ATTRIBUTE_UNLOCKSERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'MemoryBroker_Attribute_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Attribute_accessPolicy(final String value) {
        this.elt.putTagValue(MemoryBrokerAttribute.MdaTypes.MEMORYBROKER_ATTRIBUTE_ACCESSPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Attribute_lockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Attribute_lockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAttribute.MdaTypes.MEMORYBROKER_ATTRIBUTE_LOCKSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Attribute_mapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Attribute_mapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAttribute.MdaTypes.MEMORYBROKER_ATTRIBUTE_MAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Attribute_memories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Attribute_memories(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAttribute.MdaTypes.MEMORYBROKER_ATTRIBUTE_MEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Attribute_memoryBlockAdressElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Attribute_memoryBlockAdressElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAttribute.MdaTypes.MEMORYBROKER_ATTRIBUTE_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Attribute_memoryBlockSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Attribute_memoryBlockSizeElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAttribute.MdaTypes.MEMORYBROKER_ATTRIBUTE_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Attribute_unMapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Attribute_unMapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAttribute.MdaTypes.MEMORYBROKER_ATTRIBUTE_UNMAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Attribute_unlockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Attribute_unlockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAttribute.MdaTypes.MEMORYBROKER_ATTRIBUTE_UNLOCKSERVICES_TAGTYPE_ELT, values);
    }

    protected MemoryBrokerAttribute(final Attribute elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType MEMORYBROKER_ATTRIBUTE_ACCESSPOLICY_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_ATTRIBUTE_MEMORIES_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_ATTRIBUTE_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_ATTRIBUTE_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_ATTRIBUTE_LOCKSERVICES_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_ATTRIBUTE_UNLOCKSERVICES_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_ATTRIBUTE_MAPSERVICES_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_ATTRIBUTE_UNMAPSERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0204e580-0ccf-11df-8525-001302895b2b");
            MEMORYBROKER_ATTRIBUTE_ACCESSPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5fb1601c-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_ATTRIBUTE_MEMORIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5fb1601b-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_ATTRIBUTE_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5fb1601a-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_ATTRIBUTE_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5fb16019-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_ATTRIBUTE_LOCKSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5fb16018-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_ATTRIBUTE_UNLOCKSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5fb16017-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_ATTRIBUTE_MAPSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5fb16016-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_ATTRIBUTE_UNMAPSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5fb16015-172e-11df-b92a-0014222a9f79");
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
