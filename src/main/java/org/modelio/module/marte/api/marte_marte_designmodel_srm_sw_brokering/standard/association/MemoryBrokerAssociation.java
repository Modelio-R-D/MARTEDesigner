/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.association.SwResourceAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << MemoryBroker_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class MemoryBrokerAssociation extends SwResourceAssociation {
    public static final String STEREOTYPE_NAME = "MemoryBroker_Association";

    public static final String MEMORYBROKER_ASSOCIATION_ACCESSPOLICY_TAGTYPE = "MemoryBroker_Association_accessPolicy";

    public static final String MEMORYBROKER_ASSOCIATION_LOCKSERVICES_TAGTYPE = "MemoryBroker_Association_lockServices";

    public static final String MEMORYBROKER_ASSOCIATION_MAPSERVICES_TAGTYPE = "MemoryBroker_Association_mapServices";

    public static final String MEMORYBROKER_ASSOCIATION_MEMORIES_TAGTYPE = "MemoryBroker_Association_memories";

    public static final String MEMORYBROKER_ASSOCIATION_MEMORYBLOCKADRESSELEMENTS_TAGTYPE = "MemoryBroker_Association_memoryBlockAdressElements";

    public static final String MEMORYBROKER_ASSOCIATION_MEMORYBLOCKSIZEELEMENTS_TAGTYPE = "MemoryBroker_Association_memoryBlockSizeElements";

    public static final String MEMORYBROKER_ASSOCIATION_UNMAPSERVICES_TAGTYPE = "MemoryBroker_Association_unMapServices";

    public static final String MEMORYBROKER_ASSOCIATION_UNLOCKSERVICES_TAGTYPE = "MemoryBroker_Association_unlockServices";

    /**
     * Tells whether a {@link MemoryBrokerAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << MemoryBroker_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MemoryBrokerAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << MemoryBroker_Association >> then instantiate a {@link MemoryBrokerAssociation} proxy.
     * 
     * @return a {@link MemoryBrokerAssociation} proxy on the created {@link Association}.
     */
    public static MemoryBrokerAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MemoryBrokerAssociation.STEREOTYPE_NAME);
        return MemoryBrokerAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link MemoryBrokerAssociation} proxy from a {@link Association} stereotyped << MemoryBroker_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link MemoryBrokerAssociation} proxy or <i>null</i>.
     */
    public static MemoryBrokerAssociation instantiate(final Association obj) {
        return MemoryBrokerAssociation.canInstantiate(obj) ? new MemoryBrokerAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MemoryBrokerAssociation} proxy from a {@link Association} stereotyped << MemoryBroker_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link MemoryBrokerAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static MemoryBrokerAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (MemoryBrokerAssociation.canInstantiate(obj))
        	return new MemoryBrokerAssociation(obj);
        else
        	throw new IllegalArgumentException("MemoryBrokerAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        MemoryBrokerAssociation other = (MemoryBrokerAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'MemoryBroker_Association_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getMemoryBroker_Association_accessPolicy() {
        return this.elt.getTagValue(MemoryBrokerAssociation.MdaTypes.MEMORYBROKER_ASSOCIATION_ACCESSPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Association_lockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Association_lockServices() {
        return this.elt.getTagValues(MemoryBrokerAssociation.MdaTypes.MEMORYBROKER_ASSOCIATION_LOCKSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Association_mapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Association_mapServices() {
        return this.elt.getTagValues(MemoryBrokerAssociation.MdaTypes.MEMORYBROKER_ASSOCIATION_MAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Association_memories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Association_memories() {
        return this.elt.getTagValues(MemoryBrokerAssociation.MdaTypes.MEMORYBROKER_ASSOCIATION_MEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Association_memoryBlockAdressElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Association_memoryBlockAdressElements() {
        return this.elt.getTagValues(MemoryBrokerAssociation.MdaTypes.MEMORYBROKER_ASSOCIATION_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Association_memoryBlockSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Association_memoryBlockSizeElements() {
        return this.elt.getTagValues(MemoryBrokerAssociation.MdaTypes.MEMORYBROKER_ASSOCIATION_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Association_unMapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Association_unMapServices() {
        return this.elt.getTagValues(MemoryBrokerAssociation.MdaTypes.MEMORYBROKER_ASSOCIATION_UNMAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Association_unlockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Association_unlockServices() {
        return this.elt.getTagValues(MemoryBrokerAssociation.MdaTypes.MEMORYBROKER_ASSOCIATION_UNLOCKSERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'MemoryBroker_Association_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Association_accessPolicy(final String value) {
        this.elt.putTagValue(MemoryBrokerAssociation.MdaTypes.MEMORYBROKER_ASSOCIATION_ACCESSPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Association_lockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Association_lockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAssociation.MdaTypes.MEMORYBROKER_ASSOCIATION_LOCKSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Association_mapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Association_mapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAssociation.MdaTypes.MEMORYBROKER_ASSOCIATION_MAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Association_memories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Association_memories(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAssociation.MdaTypes.MEMORYBROKER_ASSOCIATION_MEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Association_memoryBlockAdressElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Association_memoryBlockAdressElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAssociation.MdaTypes.MEMORYBROKER_ASSOCIATION_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Association_memoryBlockSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Association_memoryBlockSizeElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAssociation.MdaTypes.MEMORYBROKER_ASSOCIATION_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Association_unMapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Association_unMapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAssociation.MdaTypes.MEMORYBROKER_ASSOCIATION_UNMAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Association_unlockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Association_unlockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAssociation.MdaTypes.MEMORYBROKER_ASSOCIATION_UNLOCKSERVICES_TAGTYPE_ELT, values);
    }

    protected MemoryBrokerAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType MEMORYBROKER_ASSOCIATION_ACCESSPOLICY_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_ASSOCIATION_MEMORIES_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_ASSOCIATION_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_ASSOCIATION_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_ASSOCIATION_LOCKSERVICES_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_ASSOCIATION_UNLOCKSERVICES_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_ASSOCIATION_MAPSERVICES_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_ASSOCIATION_UNMAPSERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "4b2411e7-10d2-11df-81d9-0014222a9f79");
            MEMORYBROKER_ASSOCIATION_ACCESSPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5d372c84-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_ASSOCIATION_MEMORIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5d372c83-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_ASSOCIATION_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5d372c82-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_ASSOCIATION_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5d372c81-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_ASSOCIATION_LOCKSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5d372c80-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_ASSOCIATION_UNLOCKSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5d372c7f-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_ASSOCIATION_MAPSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5d372c7e-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_ASSOCIATION_UNMAPSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5d372c7d-172e-11df-b92a-0014222a9f79");
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
