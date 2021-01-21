/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.associationend;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << HwMedia_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("edb465a8-beda-470d-bb77-709d2992eb68")
public class HwMediaAssociationEnd extends HwCommunicationResourceAssociationEnd {
    @objid ("93e172b2-cf7e-4363-befc-c6eac26e289e")
    public static final String STEREOTYPE_NAME = "HwMedia_AssociationEnd";

    @objid ("8c1a61e7-ca14-4f76-8619-d4894938ce60")
    public static final String HWMEDIA_ASSOCIATIONEND_ARBITERS_TAGTYPE = "HwMedia_AssociationEnd_arbiters";

    @objid ("98a7c83a-4ffa-413e-bbba-273f621995a3")
    public static final String HWMEDIA_ASSOCIATIONEND_BANDWIDTH_TAGTYPE = "HwMedia_AssociationEnd_bandwidth";

    /**
     * Tells whether a {@link HwMediaAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwMedia_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b5d8ae02-5b60-46b1-9dc7-9fbc18ed5d4f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMediaAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwMedia_AssociationEnd >> then instantiate a {@link HwMediaAssociationEnd} proxy.
     * 
     * @return a {@link HwMediaAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("a162c9cd-a95e-4558-9508-d1388e6e851e")
    public static HwMediaAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMediaAssociationEnd.STEREOTYPE_NAME);
        return HwMediaAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwMediaAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwMedia_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwMediaAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("28c955b1-35d0-40fc-b05c-f673b418ddac")
    public static HwMediaAssociationEnd instantiate(final AssociationEnd obj) {
        return HwMediaAssociationEnd.canInstantiate(obj) ? new HwMediaAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwMediaAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwMedia_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwMediaAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("86988cd8-9957-4a3e-9374-5843c32198ac")
    public static HwMediaAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwMediaAssociationEnd.canInstantiate(obj))
        	return new HwMediaAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwMediaAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6c575446-d58e-4686-80eb-7a84985500ad")
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
        HwMediaAssociationEnd other = (HwMediaAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("b69fa19d-b7e9-4d81-8679-d8bb2e426069")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwMedia_AssociationEnd_arbiters'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e75c8f60-6693-47d5-ab53-5f8d4485f083")
    public List<String> getHwMedia_AssociationEnd_arbiters() {
        return this.elt.getTagValues(HwMediaAssociationEnd.MdaTypes.HWMEDIA_ASSOCIATIONEND_ARBITERS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMedia_AssociationEnd_bandwidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("486b9b63-70e8-42ba-aa86-99ce2ad01f32")
    public String getHwMedia_AssociationEnd_bandwidth() {
        return this.elt.getTagValue(HwMediaAssociationEnd.MdaTypes.HWMEDIA_ASSOCIATIONEND_BANDWIDTH_TAGTYPE_ELT);
    }

    @objid ("bea41ea8-e88e-45d1-a92b-dfcede2f0ca6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwMedia_AssociationEnd_arbiters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5cbf54e3-33c0-43c5-8a65-db9e591df2b4")
    public void setHwMedia_AssociationEnd_arbiters(final List<String> values) {
        this.elt.putTagValues(HwMediaAssociationEnd.MdaTypes.HWMEDIA_ASSOCIATIONEND_ARBITERS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMedia_AssociationEnd_bandwidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c6bb9bf2-0b1a-4ce4-a2e6-48611226b94d")
    public void setHwMedia_AssociationEnd_bandwidth(final String value) {
        this.elt.putTagValue(HwMediaAssociationEnd.MdaTypes.HWMEDIA_ASSOCIATIONEND_BANDWIDTH_TAGTYPE_ELT, value);
    }

    @objid ("48e91971-25fd-4e1a-b67e-f8b47f23e814")
    protected HwMediaAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("f7d4d060-3090-4791-9a1e-bfac2b1ba2c2")
    public static final class MdaTypes {
        @objid ("bf93b07b-311a-4dd3-a57a-d2d834f63348")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b10fddee-23ba-41b1-bae9-48789b8cd3e6")
        public static TagType HWMEDIA_ASSOCIATIONEND_ARBITERS_TAGTYPE_ELT;

        @objid ("10fe6db8-3186-4283-a28e-88b211932fce")
        public static TagType HWMEDIA_ASSOCIATIONEND_BANDWIDTH_TAGTYPE_ELT;

        @objid ("2d416c17-e0e2-43d8-9c50-38cb446b7f3a")
        private static Stereotype MDAASSOCDEP;

        @objid ("1d18c4ff-cdc4-4efd-9b3a-e1aa16e0dafc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c0800a3e-1fa5-49eb-873c-9a67441e39b3")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0105cd39-0ccf-11df-8525-001302895b2b");
            HWMEDIA_ASSOCIATIONEND_ARBITERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "010a91e5-0ccf-11df-8525-001302895b2b");
            HWMEDIA_ASSOCIATIONEND_BANDWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9f649774-5d9c-11df-9e91-0014222a9f79");
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
