/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << CommunicationMedia_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c87dbe12-1234-4b3a-9fdf-6c8001041923")
public class CommunicationMediaAssociation extends ProcessingResourceAssociation {
    @objid ("fae971b1-9998-495d-9767-f2cc900889d0")
    public static final String STEREOTYPE_NAME = "CommunicationMedia_Association";

    @objid ("63341a7d-b8b3-4839-a399-19287a98596f")
    public static final String COMMUNICATIONMEDIA_ASSOCIATION_BLOCKT_TAGTYPE = "CommunicationMedia_Association_blockT";

    @objid ("00869a5d-d23d-4f8a-bfd9-8c5549aa5d07")
    public static final String COMMUNICATIONMEDIA_ASSOCIATION_CAPACITY_TAGTYPE = "CommunicationMedia_Association_capacity";

    @objid ("27692e68-be79-4e36-a17a-a15d476b1acb")
    public static final String COMMUNICATIONMEDIA_ASSOCIATION_ELEMENTSIZE_TAGTYPE = "CommunicationMedia_Association_elementSize";

    @objid ("44e29fcd-4e24-4a68-b0ec-0c85201d3688")
    public static final String COMMUNICATIONMEDIA_ASSOCIATION_PACKETT_TAGTYPE = "CommunicationMedia_Association_packetT";

    @objid ("e57e247a-3c3e-458c-bd25-379db16781f1")
    public static final String COMMUNICATIONMEDIA_ASSOCIATION_TRANSMMODE_TAGTYPE = "CommunicationMedia_Association_transmMode";

    /**
     * Tells whether a {@link CommunicationMediaAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << CommunicationMedia_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("713107d9-60a9-4294-a168-ce98ef02ad21")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationMediaAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << CommunicationMedia_Association >> then instantiate a {@link CommunicationMediaAssociation} proxy.
     * 
     * @return a {@link CommunicationMediaAssociation} proxy on the created {@link Association}.
     */
    @objid ("387b45c9-a872-402c-b36e-686da6eb11a4")
    public static CommunicationMediaAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationMediaAssociation.STEREOTYPE_NAME);
        return CommunicationMediaAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationMediaAssociation} proxy from a {@link Association} stereotyped << CommunicationMedia_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link CommunicationMediaAssociation} proxy or <i>null</i>.
     */
    @objid ("96277b60-1c75-43e1-b92e-53ca1ec0ff51")
    public static CommunicationMediaAssociation instantiate(final Association obj) {
        return CommunicationMediaAssociation.canInstantiate(obj) ? new CommunicationMediaAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationMediaAssociation} proxy from a {@link Association} stereotyped << CommunicationMedia_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link CommunicationMediaAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("abf6b01a-6b3e-4204-b82f-a0698cc6b61f")
    public static CommunicationMediaAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (CommunicationMediaAssociation.canInstantiate(obj))
        	return new CommunicationMediaAssociation(obj);
        else
        	throw new IllegalArgumentException("CommunicationMediaAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("59e0c64a-fca7-43f7-a13a-bac91ebc7147")
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
        CommunicationMediaAssociation other = (CommunicationMediaAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Association_blockT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("198afe1b-cdc1-4628-bcb4-24730d2ec31c")
    public List<String> getCommunicationMedia_Association_blockT() {
        return this.elt.getTagValues(CommunicationMediaAssociation.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATION_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Association_capacity'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("7c4eb399-0f0d-49db-84da-e4458d5db135")
    public List<String> getCommunicationMedia_Association_capacity() {
        return this.elt.getTagValues(CommunicationMediaAssociation.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATION_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'CommunicationMedia_Association_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("912d41c5-ef01-4343-9e56-1f8230266f4b")
    public String getCommunicationMedia_Association_elementSize() {
        return this.elt.getTagValue(CommunicationMediaAssociation.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATION_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Association_packetT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("65406291-03e5-4052-ab62-2be9b84aa272")
    public List<String> getCommunicationMedia_Association_packetT() {
        return this.elt.getTagValues(CommunicationMediaAssociation.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATION_PACKETT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'CommunicationMedia_Association_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4fc67e9b-bc26-4ce3-a760-19d45cedbefe")
    public String getCommunicationMedia_Association_transmMode() {
        return this.elt.getTagValue(CommunicationMediaAssociation.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATION_TRANSMMODE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("97275b48-ecc5-4219-b15c-0f6943d9267b")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    @objid ("6f487b1f-5fd4-43b7-8db2-6ce2a5c28046")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Association_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8b1fb00e-bb3c-45d0-96ea-0af20eafa037")
    public void setCommunicationMedia_Association_blockT(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaAssociation.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATION_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Association_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ff523032-b040-4686-9b3c-3d9af03bec05")
    public void setCommunicationMedia_Association_capacity(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaAssociation.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATION_CAPACITY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'CommunicationMedia_Association_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6a2c609b-2d5b-4ff5-acc4-5e81800d6852")
    public void setCommunicationMedia_Association_elementSize(final String value) {
        this.elt.putTagValue(CommunicationMediaAssociation.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATION_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Association_packetT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("306a30f9-d171-461a-bbf3-363c3ed9750d")
    public void setCommunicationMedia_Association_packetT(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaAssociation.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATION_PACKETT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'CommunicationMedia_Association_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5a9ec4cb-4e4d-4554-b113-a7a913035108")
    public void setCommunicationMedia_Association_transmMode(final String value) {
        this.elt.putTagValue(CommunicationMediaAssociation.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATION_TRANSMMODE_TAGTYPE_ELT, value);
    }

    @objid ("890f326b-a30f-40e1-ac0a-5abea4cc7ec7")
    protected CommunicationMediaAssociation(final Association elt) {
        super(elt);
    }

    @objid ("70309db5-a760-4278-8f3b-cd5473fc8b35")
    public static final class MdaTypes {
        @objid ("c974565b-f2e2-43cf-917c-6248063a8ef9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("34f3c5d6-d3dc-4588-a292-bb5be876f2f6")
        public static TagType COMMUNICATIONMEDIA_ASSOCIATION_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("49044d27-abc0-4155-82ac-ce8aab144d2f")
        public static TagType COMMUNICATIONMEDIA_ASSOCIATION_TRANSMMODE_TAGTYPE_ELT;

        @objid ("24dd448b-740a-4581-8730-2c95f34dda4d")
        public static TagType COMMUNICATIONMEDIA_ASSOCIATION_BLOCKT_TAGTYPE_ELT;

        @objid ("17ddd260-5217-472e-9347-a10963e034ac")
        public static TagType COMMUNICATIONMEDIA_ASSOCIATION_PACKETT_TAGTYPE_ELT;

        @objid ("ded668e1-0f25-471a-aafc-9e54108f172e")
        public static TagType COMMUNICATIONMEDIA_ASSOCIATION_CAPACITY_TAGTYPE_ELT;

        @objid ("e059ec94-55ac-41bb-b3f8-ad7580dead44")
        private static Stereotype MDAASSOCDEP;

        @objid ("97783e9c-c6d6-450f-bc14-6f897b5b8bd7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3f9c2b34-44f9-421a-905c-8807308838b5")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "24eaca14-0fdd-11df-86ac-0014222a9f79");
            COMMUNICATIONMEDIA_ASSOCIATION_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "27439e9c-0fdd-11df-86ac-0014222a9f79");
            COMMUNICATIONMEDIA_ASSOCIATION_TRANSMMODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "27439e9d-0fdd-11df-86ac-0014222a9f79");
            COMMUNICATIONMEDIA_ASSOCIATION_BLOCKT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "27439e9e-0fdd-11df-86ac-0014222a9f79");
            COMMUNICATIONMEDIA_ASSOCIATION_PACKETT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "27439e9f-0fdd-11df-86ac-0014222a9f79");
            COMMUNICATIONMEDIA_ASSOCIATION_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "27439ea0-0fdd-11df-86ac-0014222a9f79");
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
