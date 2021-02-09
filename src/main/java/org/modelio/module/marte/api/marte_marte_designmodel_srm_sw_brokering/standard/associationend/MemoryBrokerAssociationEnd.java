/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.associationend.SwResourceAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << MemoryBroker_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class MemoryBrokerAssociationEnd extends SwResourceAssociationEnd {
    public static final String STEREOTYPE_NAME = "MemoryBroker_AssociationEnd";

    public static final String MEMORYBROKER_ASSOCIATIONEND_ACCESSPOLICY_TAGTYPE = "MemoryBroker_AssociationEnd_accessPolicy";

    public static final String MEMORYBROKER_ASSOCIATIONEND_LOCKSERVICES_TAGTYPE = "MemoryBroker_AssociationEnd_lockServices";

    public static final String MEMORYBROKER_ASSOCIATIONEND_MAPSERVICES_TAGTYPE = "MemoryBroker_AssociationEnd_mapServices";

    public static final String MEMORYBROKER_ASSOCIATIONEND_MEMORIES_TAGTYPE = "MemoryBroker_AssociationEnd_memories";

    public static final String MEMORYBROKER_ASSOCIATIONEND_MEMORYBLOCKADRESSELEMENTS_TAGTYPE = "MemoryBroker_AssociationEnd_memoryBlockAdressElements";

    public static final String MEMORYBROKER_ASSOCIATIONEND_MEMORYBLOCKSIZEELEMENTS_TAGTYPE = "MemoryBroker_AssociationEnd_memoryBlockSizeElements";

    public static final String MEMORYBROKER_ASSOCIATIONEND_UNMAPSERVICES_TAGTYPE = "MemoryBroker_AssociationEnd_unMapServices";

    public static final String MEMORYBROKER_ASSOCIATIONEND_UNLOCKSERVICES_TAGTYPE = "MemoryBroker_AssociationEnd_unlockServices";

    /**
     * Tells whether a {@link MemoryBrokerAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << MemoryBroker_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MemoryBrokerAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << MemoryBroker_AssociationEnd >> then instantiate a {@link MemoryBrokerAssociationEnd} proxy.
     * 
     * @return a {@link MemoryBrokerAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    public static MemoryBrokerAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MemoryBrokerAssociationEnd.STEREOTYPE_NAME);
        return MemoryBrokerAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link MemoryBrokerAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << MemoryBroker_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link MemoryBrokerAssociationEnd} proxy or <i>null</i>.
     */
    public static MemoryBrokerAssociationEnd instantiate(final AssociationEnd obj) {
        return MemoryBrokerAssociationEnd.canInstantiate(obj) ? new MemoryBrokerAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MemoryBrokerAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << MemoryBroker_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link MemoryBrokerAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static MemoryBrokerAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (MemoryBrokerAssociationEnd.canInstantiate(obj))
        	return new MemoryBrokerAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("MemoryBrokerAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        MemoryBrokerAssociationEnd other = (MemoryBrokerAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'MemoryBroker_AssociationEnd_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getMemoryBroker_AssociationEnd_accessPolicy() {
        return this.elt.getTagValue(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_ACCESSPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_AssociationEnd_lockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_AssociationEnd_lockServices() {
        return this.elt.getTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_LOCKSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_AssociationEnd_mapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_AssociationEnd_mapServices() {
        return this.elt.getTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_MAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_AssociationEnd_memories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_AssociationEnd_memories() {
        return this.elt.getTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_MEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_AssociationEnd_memoryBlockAdressElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_AssociationEnd_memoryBlockAdressElements() {
        return this.elt.getTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_AssociationEnd_memoryBlockSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_AssociationEnd_memoryBlockSizeElements() {
        return this.elt.getTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_AssociationEnd_unMapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_AssociationEnd_unMapServices() {
        return this.elt.getTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_UNMAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_AssociationEnd_unlockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_AssociationEnd_unlockServices() {
        return this.elt.getTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_UNLOCKSERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'MemoryBroker_AssociationEnd_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_AssociationEnd_accessPolicy(final String value) {
        this.elt.putTagValue(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_ACCESSPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_AssociationEnd_lockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_AssociationEnd_lockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_LOCKSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_AssociationEnd_mapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_AssociationEnd_mapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_MAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_AssociationEnd_memories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_AssociationEnd_memories(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_MEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_AssociationEnd_memoryBlockAdressElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_AssociationEnd_memoryBlockAdressElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_AssociationEnd_memoryBlockSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_AssociationEnd_memoryBlockSizeElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_AssociationEnd_unMapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_AssociationEnd_unMapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_UNMAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_AssociationEnd_unlockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_AssociationEnd_unlockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_UNLOCKSERVICES_TAGTYPE_ELT, values);
    }

    protected MemoryBrokerAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType MEMORYBROKER_ASSOCIATIONEND_ACCESSPOLICY_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_ASSOCIATIONEND_MEMORIES_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_ASSOCIATIONEND_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_ASSOCIATIONEND_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_ASSOCIATIONEND_LOCKSERVICES_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_ASSOCIATIONEND_UNLOCKSERVICES_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_ASSOCIATIONEND_MAPSERVICES_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_ASSOCIATIONEND_UNMAPSERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0204e57e-0ccf-11df-8525-001302895b2b");
            MEMORYBROKER_ASSOCIATIONEND_ACCESSPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0204e585-0ccf-11df-8525-001302895b2b");
            MEMORYBROKER_ASSOCIATIONEND_MEMORIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0204e58c-0ccf-11df-8525-001302895b2b");
            MEMORYBROKER_ASSOCIATIONEND_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0204e593-0ccf-11df-8525-001302895b2b");
            MEMORYBROKER_ASSOCIATIONEND_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0204e59a-0ccf-11df-8525-001302895b2b");
            MEMORYBROKER_ASSOCIATIONEND_LOCKSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "020747d0-0ccf-11df-8525-001302895b2b");
            MEMORYBROKER_ASSOCIATIONEND_UNLOCKSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "020747d7-0ccf-11df-8525-001302895b2b");
            MEMORYBROKER_ASSOCIATIONEND_MAPSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "020747de-0ccf-11df-8525-001302895b2b");
            MEMORYBROKER_ASSOCIATIONEND_UNMAPSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "020747e5-0ccf-11df-8525-001302895b2b");
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
