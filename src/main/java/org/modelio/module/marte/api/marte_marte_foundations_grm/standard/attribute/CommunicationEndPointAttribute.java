/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute;

import java.util.ArrayList;
import java.util.Collections;
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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << CommunicationEndPoint_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("cceaea2a-f8f1-4bf5-8d30-79c14f986879")
public class CommunicationEndPointAttribute extends ResourceAttribute {
    @objid ("ad28c2c6-dcca-4431-9872-d75aad83c03d")
    public static final String STEREOTYPE_NAME = "CommunicationEndPoint_Attribute";

    @objid ("ed12f846-10dc-4607-bf06-9f6ee14f4ca2")
    public static final String COMMUNICATIONENDPOINT_ATTRIBUTE_PACKETSIZE_TAGTYPE = "CommunicationEndPoint_Attribute_packetSize";

    /**
     * Tells whether a {@link CommunicationEndPointAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << CommunicationEndPoint_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("432845f5-0ed8-4e45-9019-a8eec254710d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationEndPointAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << CommunicationEndPoint_Attribute >> then instantiate a {@link CommunicationEndPointAttribute} proxy.
     * 
     * @return a {@link CommunicationEndPointAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("4859c2fd-bcfe-4ae5-a549-8c658ef92052")
    public static CommunicationEndPointAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationEndPointAttribute.STEREOTYPE_NAME);
        return CommunicationEndPointAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationEndPointAttribute} proxy from a {@link Attribute} stereotyped << CommunicationEndPoint_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link CommunicationEndPointAttribute} proxy or <i>null</i>.
     */
    @objid ("e2e57684-8d64-4c3d-b199-5205baab12e4")
    public static CommunicationEndPointAttribute instantiate(final Attribute obj) {
        return CommunicationEndPointAttribute.canInstantiate(obj) ? new CommunicationEndPointAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationEndPointAttribute} proxy from a {@link Attribute} stereotyped << CommunicationEndPoint_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link CommunicationEndPointAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1d8e9e96-be13-4eb3-ac0e-aee0a72c70cd")
    public static CommunicationEndPointAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (CommunicationEndPointAttribute.canInstantiate(obj))
        	return new CommunicationEndPointAttribute(obj);
        else
        	throw new IllegalArgumentException("CommunicationEndPointAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("45848b3e-2f0f-43bc-9aa0-deb9d80a94fd")
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
        CommunicationEndPointAttribute other = (CommunicationEndPointAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'CommunicationEndPoint_Attribute_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bf156571-b66e-4af1-96b7-8424fb860a5b")
    public String getCommunicationEndPoint_Attribute_packetSize() {
        return this.elt.getTagValue(CommunicationEndPointAttribute.MdaTypes.COMMUNICATIONENDPOINT_ATTRIBUTE_PACKETSIZE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("7ae5313c-1e0a-4f9f-bd67-fab15f43e09e")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    @objid ("cd4833fa-a0e1-42c9-a0cd-d289b1e31a3c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'CommunicationEndPoint_Attribute_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0c1d1411-f2a9-41d3-9f40-4f1867b50bdb")
    public void setCommunicationEndPoint_Attribute_packetSize(final String value) {
        this.elt.putTagValue(CommunicationEndPointAttribute.MdaTypes.COMMUNICATIONENDPOINT_ATTRIBUTE_PACKETSIZE_TAGTYPE_ELT, value);
    }

    @objid ("a6f98fd3-2441-4756-a281-c7083de0424d")
    protected CommunicationEndPointAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("777f988a-cda2-4f33-968f-a25e96292b27")
    public static final class MdaTypes {
        @objid ("7e5c87e7-459e-43c1-afd4-20b1136c7e31")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("60513fde-5203-4acb-97fd-83dbd3a51993")
        public static TagType COMMUNICATIONENDPOINT_ATTRIBUTE_PACKETSIZE_TAGTYPE_ELT;

        @objid ("32e6989f-1445-4e00-885a-761df4712cab")
        private static Stereotype MDAASSOCDEP;

        @objid ("fe2fa86a-64c9-4377-95b3-6b9d3fc82fce")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1f5c9ed4-488e-44a0-83b0-856369cf49a4")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ffa4f5d9-0cce-11df-8525-001302895b2b");
            COMMUNICATIONENDPOINT_ATTRIBUTE_PACKETSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ffa4f5e0-0cce-11df-8525-001302895b2b");
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
