/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("6750a6af-321c-4042-b6a2-122ad82d7ce7")
    public static final String STEREOTYPE_NAME = "CommunicationEndPoint_Attribute";

    @objid ("45d40745-8802-42fd-aab9-7b8d7f2da886")
    public static final String COMMUNICATIONENDPOINT_ATTRIBUTE_PACKETSIZE_TAGTYPE = "CommunicationEndPoint_Attribute_packetSize";

    /**
     * Tells whether a {@link CommunicationEndPointAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << CommunicationEndPoint_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("8bafd042-f16c-4f64-bb70-fe9e041c8cb7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationEndPointAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << CommunicationEndPoint_Attribute >> then instantiate a {@link CommunicationEndPointAttribute} proxy.
     * 
     * @return a {@link CommunicationEndPointAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("ab522f4f-541b-4945-9cbf-0a93f0d47662")
    public static CommunicationEndPointAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationEndPointAttribute.STEREOTYPE_NAME);
        return CommunicationEndPointAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationEndPointAttribute} proxy from a {@link Attribute} stereotyped << CommunicationEndPoint_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link CommunicationEndPointAttribute} proxy or <i>null</i>.
     */
    @objid ("4fdb4463-8992-4fb9-a94a-6bc209169192")
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
    @objid ("cfc35cda-4a0b-44e5-99c8-0ef3db774216")
    public static CommunicationEndPointAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (CommunicationEndPointAttribute.canInstantiate(obj))
        	return new CommunicationEndPointAttribute(obj);
        else
        	throw new IllegalArgumentException("CommunicationEndPointAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("72d3f0fc-be2a-4b20-8bb0-21b9be6780d3")
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
    @objid ("359ed105-64da-4827-ba03-babed49bf15c")
    public String getCommunicationEndPoint_Attribute_packetSize() {
        return this.elt.getTagValue(CommunicationEndPointAttribute.MdaTypes.COMMUNICATIONENDPOINT_ATTRIBUTE_PACKETSIZE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("3cbe7e0d-335c-45de-a371-0e2d905a4ae7")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    @objid ("5ed157af-1033-4269-8535-72f768f05226")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'CommunicationEndPoint_Attribute_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e7c41633-5043-4ab1-bb36-8264c5e41c74")
    public void setCommunicationEndPoint_Attribute_packetSize(final String value) {
        this.elt.putTagValue(CommunicationEndPointAttribute.MdaTypes.COMMUNICATIONENDPOINT_ATTRIBUTE_PACKETSIZE_TAGTYPE_ELT, value);
    }

    @objid ("2a7b4179-c80f-47ed-ade6-31dfe4942da2")
    protected CommunicationEndPointAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("777f988a-cda2-4f33-968f-a25e96292b27")
    public static final class MdaTypes {
        @objid ("3141272a-dedb-4545-a183-6a96483e4481")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("300dee28-a0cb-4cae-804a-b6227bf614a2")
        public static TagType COMMUNICATIONENDPOINT_ATTRIBUTE_PACKETSIZE_TAGTYPE_ELT;

        @objid ("8c8c5207-39b2-4ee9-9474-0bb06818552c")
        private static Stereotype MDAASSOCDEP;

        @objid ("c367f70b-e641-4e17-a6a2-2159be7e3fbe")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1dc4a1b1-0434-4373-8803-0bf6e6a45669")
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
