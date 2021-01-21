/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.association;

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
@objid ("f0efafa0-290a-481a-b6e9-88849827d289")
public class MemoryBrokerAssociation extends SwResourceAssociation {
    @objid ("218912e5-fe4e-483d-a898-6b42296852bf")
    public static final String STEREOTYPE_NAME = "MemoryBroker_Association";

    @objid ("628e4f88-d054-444d-86aa-da243e18ebd3")
    public static final String MEMORYBROKER_ASSOCIATION_ACCESSPOLICY_TAGTYPE = "MemoryBroker_Association_accessPolicy";

    @objid ("10b61007-a4e0-4526-a2ff-039cdf8018c0")
    public static final String MEMORYBROKER_ASSOCIATION_LOCKSERVICES_TAGTYPE = "MemoryBroker_Association_lockServices";

    @objid ("5b97a1ae-fd62-405b-a760-667dd927d554")
    public static final String MEMORYBROKER_ASSOCIATION_MAPSERVICES_TAGTYPE = "MemoryBroker_Association_mapServices";

    @objid ("20270010-b523-4b29-aee6-66cf9dedd2cc")
    public static final String MEMORYBROKER_ASSOCIATION_MEMORIES_TAGTYPE = "MemoryBroker_Association_memories";

    @objid ("33cb131f-5311-4257-9535-70849458dba1")
    public static final String MEMORYBROKER_ASSOCIATION_MEMORYBLOCKADRESSELEMENTS_TAGTYPE = "MemoryBroker_Association_memoryBlockAdressElements";

    @objid ("0e62ee9d-4fc0-4298-9683-94d47c64d8d4")
    public static final String MEMORYBROKER_ASSOCIATION_MEMORYBLOCKSIZEELEMENTS_TAGTYPE = "MemoryBroker_Association_memoryBlockSizeElements";

    @objid ("21a7b2b2-7209-4fd1-b79b-7044584ebfa4")
    public static final String MEMORYBROKER_ASSOCIATION_UNMAPSERVICES_TAGTYPE = "MemoryBroker_Association_unMapServices";

    @objid ("f2dc18ed-8674-46ec-8555-b24e18c1a6c4")
    public static final String MEMORYBROKER_ASSOCIATION_UNLOCKSERVICES_TAGTYPE = "MemoryBroker_Association_unlockServices";

    /**
     * Tells whether a {@link MemoryBrokerAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << MemoryBroker_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("d23eb47f-8844-4cc4-a593-d76f0a148749")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MemoryBrokerAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << MemoryBroker_Association >> then instantiate a {@link MemoryBrokerAssociation} proxy.
     * 
     * @return a {@link MemoryBrokerAssociation} proxy on the created {@link Association}.
     */
    @objid ("37976fb6-d782-4c8f-82f0-edaf899e84a9")
    public static MemoryBrokerAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MemoryBrokerAssociation.STEREOTYPE_NAME);
        return MemoryBrokerAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link MemoryBrokerAssociation} proxy from a {@link Association} stereotyped << MemoryBroker_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link MemoryBrokerAssociation} proxy or <i>null</i>.
     */
    @objid ("2a39c11a-15ec-45f2-a904-8c72eab41f8a")
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
    @objid ("85e07b96-5e96-4dee-9701-bcbed1f62bc7")
    public static MemoryBrokerAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (MemoryBrokerAssociation.canInstantiate(obj))
        	return new MemoryBrokerAssociation(obj);
        else
        	throw new IllegalArgumentException("MemoryBrokerAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("497b8aad-5e63-423d-8884-9967029accc1")
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
    @objid ("aa6c431a-f4a5-4d9f-b01f-53f62e4b5638")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'MemoryBroker_Association_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("735c6d00-696c-43f7-b09b-9dc19df1baee")
    public String getMemoryBroker_Association_accessPolicy() {
        return this.elt.getTagValue(MemoryBrokerAssociation.MdaTypes.MEMORYBROKER_ASSOCIATION_ACCESSPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Association_lockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("fc7fd1d0-5240-4638-b190-52bf7361a4ef")
    public List<String> getMemoryBroker_Association_lockServices() {
        return this.elt.getTagValues(MemoryBrokerAssociation.MdaTypes.MEMORYBROKER_ASSOCIATION_LOCKSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Association_mapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1adeaed8-4f5d-408b-bc73-e495dc0abfaf")
    public List<String> getMemoryBroker_Association_mapServices() {
        return this.elt.getTagValues(MemoryBrokerAssociation.MdaTypes.MEMORYBROKER_ASSOCIATION_MAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Association_memories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c19048d7-f5c2-4c68-ad53-7c158682ec11")
    public List<String> getMemoryBroker_Association_memories() {
        return this.elt.getTagValues(MemoryBrokerAssociation.MdaTypes.MEMORYBROKER_ASSOCIATION_MEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Association_memoryBlockAdressElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b5be4f6a-8685-42ae-b369-28acb1599b75")
    public List<String> getMemoryBroker_Association_memoryBlockAdressElements() {
        return this.elt.getTagValues(MemoryBrokerAssociation.MdaTypes.MEMORYBROKER_ASSOCIATION_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Association_memoryBlockSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("00abbe70-c712-4a9c-85c6-1723c6ae8ad8")
    public List<String> getMemoryBroker_Association_memoryBlockSizeElements() {
        return this.elt.getTagValues(MemoryBrokerAssociation.MdaTypes.MEMORYBROKER_ASSOCIATION_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Association_unMapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e302cd8f-9235-42f8-988a-b91798b3632f")
    public List<String> getMemoryBroker_Association_unMapServices() {
        return this.elt.getTagValues(MemoryBrokerAssociation.MdaTypes.MEMORYBROKER_ASSOCIATION_UNMAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Association_unlockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0ee63521-285c-4a4a-ae83-718859626761")
    public List<String> getMemoryBroker_Association_unlockServices() {
        return this.elt.getTagValues(MemoryBrokerAssociation.MdaTypes.MEMORYBROKER_ASSOCIATION_UNLOCKSERVICES_TAGTYPE_ELT);
    }

    @objid ("74f0f30c-7d0d-4a6c-8b02-33e5a79ef9b6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'MemoryBroker_Association_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("feb12a6f-d972-4b89-9dba-e57452b8207a")
    public void setMemoryBroker_Association_accessPolicy(final String value) {
        this.elt.putTagValue(MemoryBrokerAssociation.MdaTypes.MEMORYBROKER_ASSOCIATION_ACCESSPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Association_lockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fd564234-c7c6-4d4a-b18b-90b360a530df")
    public void setMemoryBroker_Association_lockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAssociation.MdaTypes.MEMORYBROKER_ASSOCIATION_LOCKSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Association_mapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7e9cbd9b-62d6-425b-9539-9f2c663e86a8")
    public void setMemoryBroker_Association_mapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAssociation.MdaTypes.MEMORYBROKER_ASSOCIATION_MAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Association_memories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b48093d4-03f3-4251-8437-d403bf81199e")
    public void setMemoryBroker_Association_memories(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAssociation.MdaTypes.MEMORYBROKER_ASSOCIATION_MEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Association_memoryBlockAdressElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("65a7b845-7f40-4beb-b921-9080b088fdea")
    public void setMemoryBroker_Association_memoryBlockAdressElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAssociation.MdaTypes.MEMORYBROKER_ASSOCIATION_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Association_memoryBlockSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ebdc6f6a-6551-47fc-ae05-f0f3a153b3d8")
    public void setMemoryBroker_Association_memoryBlockSizeElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAssociation.MdaTypes.MEMORYBROKER_ASSOCIATION_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Association_unMapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("60082895-6b98-47e8-ba08-30b52001fd87")
    public void setMemoryBroker_Association_unMapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAssociation.MdaTypes.MEMORYBROKER_ASSOCIATION_UNMAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Association_unlockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("78e115af-9e0b-4eee-ac69-34b124b8a1f6")
    public void setMemoryBroker_Association_unlockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAssociation.MdaTypes.MEMORYBROKER_ASSOCIATION_UNLOCKSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("bd6a7aab-5e09-49a3-ab19-3d381051017b")
    protected MemoryBrokerAssociation(final Association elt) {
        super(elt);
    }

    @objid ("de6f0d57-2602-42b1-b67c-96026235d6a8")
    public static final class MdaTypes {
        @objid ("563806b0-e427-46d9-9f3f-74b8fcc70312")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("401ffa4a-ea79-42be-98ec-b303d5cb3e5a")
        public static TagType MEMORYBROKER_ASSOCIATION_ACCESSPOLICY_TAGTYPE_ELT;

        @objid ("8aaf43e4-c0ee-43dd-8347-21c524f40760")
        public static TagType MEMORYBROKER_ASSOCIATION_MEMORIES_TAGTYPE_ELT;

        @objid ("40df11e8-cf0d-4f1b-b286-f425518af06b")
        public static TagType MEMORYBROKER_ASSOCIATION_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT;

        @objid ("91a2d0d6-a5a8-4c1d-b3c1-314133adb14d")
        public static TagType MEMORYBROKER_ASSOCIATION_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT;

        @objid ("7c6943b8-b2e1-4575-b640-a5b70d04fcf9")
        public static TagType MEMORYBROKER_ASSOCIATION_LOCKSERVICES_TAGTYPE_ELT;

        @objid ("e1077be6-793b-49b8-885d-9aab68555ef9")
        public static TagType MEMORYBROKER_ASSOCIATION_UNLOCKSERVICES_TAGTYPE_ELT;

        @objid ("11015ee5-aa1f-4e00-b757-65a44222d215")
        public static TagType MEMORYBROKER_ASSOCIATION_MAPSERVICES_TAGTYPE_ELT;

        @objid ("2e99820c-5f8d-493f-b32f-ddb2df46e259")
        public static TagType MEMORYBROKER_ASSOCIATION_UNMAPSERVICES_TAGTYPE_ELT;

        @objid ("ad21c8bb-0471-4f75-9677-1f323aabde78")
        private static Stereotype MDAASSOCDEP;

        @objid ("299895d6-b35a-4af1-8af5-4e867b4f437a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8f19bc45-dafe-4f60-8636-ed7ff60a0116")
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
