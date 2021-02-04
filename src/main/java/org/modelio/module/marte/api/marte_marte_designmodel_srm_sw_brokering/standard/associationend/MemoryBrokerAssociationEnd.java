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
@objid ("77729413-6792-467d-9383-015cbe8ff9e5")
public class MemoryBrokerAssociationEnd extends SwResourceAssociationEnd {
    @objid ("1778a970-7ded-4881-b69c-33ab023786bf")
    public static final String STEREOTYPE_NAME = "MemoryBroker_AssociationEnd";

    @objid ("0119434a-0519-431c-93e4-33b3e1ad1fb2")
    public static final String MEMORYBROKER_ASSOCIATIONEND_ACCESSPOLICY_TAGTYPE = "MemoryBroker_AssociationEnd_accessPolicy";

    @objid ("a959ccd1-6b83-47b5-b17c-026a9b83f43d")
    public static final String MEMORYBROKER_ASSOCIATIONEND_LOCKSERVICES_TAGTYPE = "MemoryBroker_AssociationEnd_lockServices";

    @objid ("7b1ca0a9-900a-4d0f-bba9-2c593b499d1d")
    public static final String MEMORYBROKER_ASSOCIATIONEND_MAPSERVICES_TAGTYPE = "MemoryBroker_AssociationEnd_mapServices";

    @objid ("e30677c6-6178-4192-8638-0073b210520c")
    public static final String MEMORYBROKER_ASSOCIATIONEND_MEMORIES_TAGTYPE = "MemoryBroker_AssociationEnd_memories";

    @objid ("0a16202b-d2e6-48e3-9110-86d53a4388dc")
    public static final String MEMORYBROKER_ASSOCIATIONEND_MEMORYBLOCKADRESSELEMENTS_TAGTYPE = "MemoryBroker_AssociationEnd_memoryBlockAdressElements";

    @objid ("1425b5d2-e882-40d4-a5a7-d980a69aab7d")
    public static final String MEMORYBROKER_ASSOCIATIONEND_MEMORYBLOCKSIZEELEMENTS_TAGTYPE = "MemoryBroker_AssociationEnd_memoryBlockSizeElements";

    @objid ("6eea31dd-27dd-4c97-a3a0-237b25700f31")
    public static final String MEMORYBROKER_ASSOCIATIONEND_UNMAPSERVICES_TAGTYPE = "MemoryBroker_AssociationEnd_unMapServices";

    @objid ("f5dbdd05-73f8-4a29-aec8-346075a6bddd")
    public static final String MEMORYBROKER_ASSOCIATIONEND_UNLOCKSERVICES_TAGTYPE = "MemoryBroker_AssociationEnd_unlockServices";

    /**
     * Tells whether a {@link MemoryBrokerAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << MemoryBroker_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("acb9faea-5bf5-4501-b996-8a7206f5358c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MemoryBrokerAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << MemoryBroker_AssociationEnd >> then instantiate a {@link MemoryBrokerAssociationEnd} proxy.
     * 
     * @return a {@link MemoryBrokerAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("f197ed53-8234-482b-a644-acbb4b4e738d")
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
    @objid ("ee5ba293-28c2-419f-8abf-de8202cf4040")
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
    @objid ("b7b73254-1b0b-448b-93ff-33738e92e8a9")
    public static MemoryBrokerAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (MemoryBrokerAssociationEnd.canInstantiate(obj))
        	return new MemoryBrokerAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("MemoryBrokerAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2bcb310e-2ea9-4a9d-84c8-3fd9b86d9a56")
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
    @objid ("7e523644-0083-49db-a858-58a133131d1b")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'MemoryBroker_AssociationEnd_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("aefeb9ad-5eca-4600-9911-bdc96e817b70")
    public String getMemoryBroker_AssociationEnd_accessPolicy() {
        return this.elt.getTagValue(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_ACCESSPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_AssociationEnd_lockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("72b69812-3e0d-43a1-aad2-d42581794f0d")
    public List<String> getMemoryBroker_AssociationEnd_lockServices() {
        return this.elt.getTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_LOCKSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_AssociationEnd_mapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1f668203-3b0a-4946-9ee9-6be4241d1e67")
    public List<String> getMemoryBroker_AssociationEnd_mapServices() {
        return this.elt.getTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_MAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_AssociationEnd_memories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a84ce66d-8eb9-4464-9b9a-09cde0635b93")
    public List<String> getMemoryBroker_AssociationEnd_memories() {
        return this.elt.getTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_MEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_AssociationEnd_memoryBlockAdressElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5ee93520-58b4-4fd1-b69e-490fd9061f50")
    public List<String> getMemoryBroker_AssociationEnd_memoryBlockAdressElements() {
        return this.elt.getTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_AssociationEnd_memoryBlockSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8ad4cc24-c229-4f20-9b9c-327f76a72245")
    public List<String> getMemoryBroker_AssociationEnd_memoryBlockSizeElements() {
        return this.elt.getTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_AssociationEnd_unMapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9fb1f295-426f-426d-8779-cfc900e68538")
    public List<String> getMemoryBroker_AssociationEnd_unMapServices() {
        return this.elt.getTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_UNMAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_AssociationEnd_unlockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("94cd4efe-ee49-4975-a9c4-155273f9c17a")
    public List<String> getMemoryBroker_AssociationEnd_unlockServices() {
        return this.elt.getTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_UNLOCKSERVICES_TAGTYPE_ELT);
    }

    @objid ("a89e61b3-81df-4489-8f47-66bd8b9bd00c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'MemoryBroker_AssociationEnd_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ac8a6a93-a2fa-4595-9521-17e6aa9e23d7")
    public void setMemoryBroker_AssociationEnd_accessPolicy(final String value) {
        this.elt.putTagValue(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_ACCESSPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_AssociationEnd_lockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d2d56197-0cc1-4440-b329-11b24e77721d")
    public void setMemoryBroker_AssociationEnd_lockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_LOCKSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_AssociationEnd_mapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("17f83748-5a82-4876-bc5f-52daeadd5f43")
    public void setMemoryBroker_AssociationEnd_mapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_MAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_AssociationEnd_memories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f0fcdc25-01ff-4284-933c-3e046e3c95b9")
    public void setMemoryBroker_AssociationEnd_memories(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_MEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_AssociationEnd_memoryBlockAdressElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a46c606a-03e3-48fe-958a-f423e6d62c76")
    public void setMemoryBroker_AssociationEnd_memoryBlockAdressElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_AssociationEnd_memoryBlockSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("eaf41996-c03b-462c-a18b-38d4561a914f")
    public void setMemoryBroker_AssociationEnd_memoryBlockSizeElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_AssociationEnd_unMapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("86d32ebd-f5a9-4fc2-b975-5672e153e2d1")
    public void setMemoryBroker_AssociationEnd_unMapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_UNMAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_AssociationEnd_unlockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("09001081-1400-4a9e-9813-f5ce0476df6e")
    public void setMemoryBroker_AssociationEnd_unlockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_UNLOCKSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("cec60776-a150-4715-b247-3c981766b4c4")
    protected MemoryBrokerAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("659cdcb8-309c-4b25-a80f-32f9f04d729e")
    public static final class MdaTypes {
        @objid ("8f10c8d1-b684-4daf-bf25-080d432b4d0f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e876bfe0-b515-46c6-9620-1f8b90cb476c")
        public static TagType MEMORYBROKER_ASSOCIATIONEND_ACCESSPOLICY_TAGTYPE_ELT;

        @objid ("b1c5de92-15c8-49b9-ad89-cbe362ef0d7d")
        public static TagType MEMORYBROKER_ASSOCIATIONEND_MEMORIES_TAGTYPE_ELT;

        @objid ("c7972dbe-2194-430b-b31a-017a850a4e59")
        public static TagType MEMORYBROKER_ASSOCIATIONEND_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT;

        @objid ("0a80fc7e-6595-4f6e-b159-842b0173eacf")
        public static TagType MEMORYBROKER_ASSOCIATIONEND_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT;

        @objid ("7bd5f30c-57c4-4ea0-bccd-771b078b7549")
        public static TagType MEMORYBROKER_ASSOCIATIONEND_LOCKSERVICES_TAGTYPE_ELT;

        @objid ("059a0912-af3c-4d08-a91d-f43a6bcbc9f4")
        public static TagType MEMORYBROKER_ASSOCIATIONEND_UNLOCKSERVICES_TAGTYPE_ELT;

        @objid ("3bb6df71-f13e-447c-a7cd-467dc65b969d")
        public static TagType MEMORYBROKER_ASSOCIATIONEND_MAPSERVICES_TAGTYPE_ELT;

        @objid ("1fa4da03-accd-4934-850a-f907bbd4c15b")
        public static TagType MEMORYBROKER_ASSOCIATIONEND_UNMAPSERVICES_TAGTYPE_ELT;

        @objid ("ed0e9999-4017-44f1-be5d-7606481836da")
        private static Stereotype MDAASSOCDEP;

        @objid ("4bc04127-9a3c-468a-9f96-69e61ae08325")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("27a464e7-928e-492a-9ae3-d37a804bb98c")
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
