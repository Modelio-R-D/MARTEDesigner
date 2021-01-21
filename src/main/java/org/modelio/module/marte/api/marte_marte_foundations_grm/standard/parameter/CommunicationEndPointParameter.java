/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter;

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
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << CommunicationEndPoint_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("a5410c49-87f4-4dbc-a1ae-d54cdd9ba58b")
public class CommunicationEndPointParameter {
    @objid ("00e9b1b9-175f-4f96-a830-cf108f45ea0f")
    public static final String STEREOTYPE_NAME = "CommunicationEndPoint_Parameter";

    @objid ("b10bd196-2943-4d8a-a2de-ba2c2f223d62")
    public static final String COMMUNICATIONENDPOINT_PARAMETER_PACKETSIZE_TAGTYPE = "CommunicationEndPoint_Parameter_packetSize";

    /**
     * The underlying {@link Parameter} represented by this proxy, never null.
     */
    @objid ("60df699e-4350-4650-94cc-0bc41c942ce3")
    protected final Parameter elt;

    /**
     * Tells whether a {@link CommunicationEndPointParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << CommunicationEndPoint_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("1965731e-4790-45b7-8886-2b2e2914e042")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationEndPointParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << CommunicationEndPoint_Parameter >> then instantiate a {@link CommunicationEndPointParameter} proxy.
     * 
     * @return a {@link CommunicationEndPointParameter} proxy on the created {@link Parameter}.
     */
    @objid ("5f3be0db-31b7-48eb-b2a1-f854d9876d36")
    public static CommunicationEndPointParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationEndPointParameter.STEREOTYPE_NAME);
        return CommunicationEndPointParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationEndPointParameter} proxy from a {@link Parameter} stereotyped << CommunicationEndPoint_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link CommunicationEndPointParameter} proxy or <i>null</i>.
     */
    @objid ("15bc2908-1599-4775-bd08-453860250cb1")
    public static CommunicationEndPointParameter instantiate(final Parameter obj) {
        return CommunicationEndPointParameter.canInstantiate(obj) ? new CommunicationEndPointParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationEndPointParameter} proxy from a {@link Parameter} stereotyped << CommunicationEndPoint_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link CommunicationEndPointParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("cdb92ed7-30f4-4cfb-8464-e65b72c30630")
    public static CommunicationEndPointParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (CommunicationEndPointParameter.canInstantiate(obj))
        	return new CommunicationEndPointParameter(obj);
        else
        	throw new IllegalArgumentException("CommunicationEndPointParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e2d04135-7c94-490a-b08b-1a101264b713")
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
        CommunicationEndPointParameter other = (CommunicationEndPointParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'CommunicationEndPoint_Parameter_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("24cc665c-1e82-4fa2-b020-8072bdd0d0d7")
    public String getCommunicationEndPoint_Parameter_packetSize() {
        return this.elt.getTagValue(CommunicationEndPointParameter.MdaTypes.COMMUNICATIONENDPOINT_PARAMETER_PACKETSIZE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("a2b460c3-ff7c-48a7-be44-d4b423f2a86b")
    public Parameter getElement() {
        return this.elt;
    }

    @objid ("20a9703a-adbb-4cfa-8c02-9fbc061ef7d8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'CommunicationEndPoint_Parameter_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e7d7c6e2-70a6-40a3-a501-d4a372fdea65")
    public void setCommunicationEndPoint_Parameter_packetSize(final String value) {
        this.elt.putTagValue(CommunicationEndPointParameter.MdaTypes.COMMUNICATIONENDPOINT_PARAMETER_PACKETSIZE_TAGTYPE_ELT, value);
    }

    @objid ("c2f66b33-e52e-44c9-b9c9-c9c7f8b1b7ff")
    protected CommunicationEndPointParameter(final Parameter elt) {
        this.elt = elt;
    }

    @objid ("f36472bd-d517-4af4-bd61-bac1542ceb82")
    public static final class MdaTypes {
        @objid ("dea2113c-cc37-4a82-a861-be02a168ed75")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c4979de2-7e8d-4296-9791-3c7aa70b4656")
        public static TagType COMMUNICATIONENDPOINT_PARAMETER_PACKETSIZE_TAGTYPE_ELT;

        @objid ("f3077c7a-dde9-455a-95fe-bcb1dc5ec76b")
        private static Stereotype MDAASSOCDEP;

        @objid ("f78594dc-8f06-47b2-9597-38b1544ba77e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("38a01872-a31a-4abe-a565-445e236c7629")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "7a89dfe1-0f46-11df-8c52-0014222a9f79");
            COMMUNICATIONENDPOINT_PARAMETER_PACKETSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "79bfb7bf-0f47-11df-8c52-0014222a9f79");
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
