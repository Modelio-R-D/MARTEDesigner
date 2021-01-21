/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_annexes_rsm.standard.connector;

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
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Connector} with << Tiler_Connector >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("abbb3dd1-8ba9-4d8b-b68f-3ff40eecae5b")
public class TilerConnector {
    @objid ("c911af3a-4928-4485-858e-edd2aadf2dac")
    public static final String STEREOTYPE_NAME = "Tiler_Connector";

    @objid ("43aadb17-e9c0-4bca-8377-9534b65550ed")
    public static final String TILER_CONNECTOR_FITTING_TAGTYPE = "Tiler_Connector_fitting";

    @objid ("28d2a7ca-384d-4a33-975f-14732711c957")
    public static final String TILER_CONNECTOR_ORIGIN_TAGTYPE = "Tiler_Connector_origin";

    @objid ("00d18273-1abc-4a5a-b32a-34adda03a990")
    public static final String TILER_CONNECTOR_PAVING_TAGTYPE = "Tiler_Connector_paving";

    @objid ("ae024461-c30e-47be-b3ca-01db694ce149")
    public static final String TILER_CONNECTOR_TILER_TAGTYPE = "Tiler_Connector_tiler";

    /**
     * The underlying {@link Connector} represented by this proxy, never null.
     */
    @objid ("a2e98cb5-f9ef-492b-9daf-cd6ef30577d8")
    protected final Connector elt;

    /**
     * Tells whether a {@link TilerConnector proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << Tiler_Connector >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("ebfa796e-d80f-4a5c-940e-8a368efd9510")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TilerConnector.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Connector} stereotyped << Tiler_Connector >> then instantiate a {@link TilerConnector} proxy.
     * 
     * @return a {@link TilerConnector} proxy on the created {@link Connector}.
     */
    @objid ("d1532a8e-8f88-43dc-8a86-0c54f7ad61c5")
    public static TilerConnector create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Connector");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TilerConnector.STEREOTYPE_NAME);
        return TilerConnector.instantiate((Connector)e);
    }

    /**
     * Tries to instantiate a {@link TilerConnector} proxy from a {@link Connector} stereotyped << Tiler_Connector >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Connector
     * @return a {@link TilerConnector} proxy or <i>null</i>.
     */
    @objid ("e7b99183-95da-442e-b843-031dbc95f896")
    public static TilerConnector instantiate(final Connector obj) {
        return TilerConnector.canInstantiate(obj) ? new TilerConnector(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TilerConnector} proxy from a {@link Connector} stereotyped << Tiler_Connector >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Connector}
     * @return a {@link TilerConnector} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1d8afba6-280e-47b0-b586-d90af577b8ed")
    public static TilerConnector safeInstantiate(final Connector obj) throws IllegalArgumentException {
        if (TilerConnector.canInstantiate(obj))
        	return new TilerConnector(obj);
        else
        	throw new IllegalArgumentException("TilerConnector: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("48758341-ae72-45a5-bb5b-5186138b1e7e")
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
        TilerConnector other = (TilerConnector) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Connector}. 
     * @return the Connector represented by this proxy, never null.
     */
    @objid ("1eeb7e6d-d6ee-468a-a64a-7feb9a3ea54e")
    public Connector getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Tiler_Connector_fitting'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7bd8c082-84e0-4f90-8104-776fdb2e84cd")
    public String getTiler_Connector_fitting() {
        return this.elt.getTagValue(TilerConnector.MdaTypes.TILER_CONNECTOR_FITTING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Tiler_Connector_origin'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("27d7a867-347b-4b68-9aa5-cd232bbaad72")
    public String getTiler_Connector_origin() {
        return this.elt.getTagValue(TilerConnector.MdaTypes.TILER_CONNECTOR_ORIGIN_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Tiler_Connector_paving'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("911e9d05-3305-4aca-a37d-04a6e3171b87")
    public String getTiler_Connector_paving() {
        return this.elt.getTagValue(TilerConnector.MdaTypes.TILER_CONNECTOR_PAVING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Tiler_Connector_tiler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fe0baf1a-7f88-4372-9038-9774ecfaaffb")
    public String getTiler_Connector_tiler() {
        return this.elt.getTagValue(TilerConnector.MdaTypes.TILER_CONNECTOR_TILER_TAGTYPE_ELT);
    }

    @objid ("502290c8-1580-42d3-9d8d-c6f5adb0fd1d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Tiler_Connector_fitting'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5d9d99b1-b861-455a-af3f-167845610535")
    public void setTiler_Connector_fitting(final String value) {
        this.elt.putTagValue(TilerConnector.MdaTypes.TILER_CONNECTOR_FITTING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Tiler_Connector_origin'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a1d73274-536a-4e32-a6fd-fd56526b2fd4")
    public void setTiler_Connector_origin(final String value) {
        this.elt.putTagValue(TilerConnector.MdaTypes.TILER_CONNECTOR_ORIGIN_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Tiler_Connector_paving'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("91de620a-6852-4b4a-8d52-cf1d2115f60c")
    public void setTiler_Connector_paving(final String value) {
        this.elt.putTagValue(TilerConnector.MdaTypes.TILER_CONNECTOR_PAVING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Tiler_Connector_tiler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("40b70a4b-68db-40e2-b878-11ab92a92149")
    public void setTiler_Connector_tiler(final String value) {
        this.elt.putTagValue(TilerConnector.MdaTypes.TILER_CONNECTOR_TILER_TAGTYPE_ELT, value);
    }

    @objid ("2a69a7c7-0484-4043-979e-fc32ea4f9f06")
    protected TilerConnector(final Connector elt) {
        this.elt = elt;
    }

    @objid ("0e2180e5-2897-496f-abde-5d41e2ac991e")
    public static final class MdaTypes {
        @objid ("aec18682-e453-4f66-9268-90fdb0a70e40")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("01defd79-65b8-42f9-b02b-f33a6f43c078")
        public static TagType TILER_CONNECTOR_ORIGIN_TAGTYPE_ELT;

        @objid ("b1877bad-986b-4eb4-8692-132f5724805d")
        public static TagType TILER_CONNECTOR_PAVING_TAGTYPE_ELT;

        @objid ("7078c344-2f24-42c4-a49b-65677466cc18")
        public static TagType TILER_CONNECTOR_FITTING_TAGTYPE_ELT;

        @objid ("6bd072bd-fdb1-47c7-a318-b10442ffafa5")
        public static TagType TILER_CONNECTOR_TILER_TAGTYPE_ELT;

        @objid ("f7ad2d5a-14c2-4285-81b6-0076b6bcc8a0")
        private static Stereotype MDAASSOCDEP;

        @objid ("cd76e0c8-5f3b-4889-ae12-f66fcfc9842b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f795dfbe-79f7-4fec-a617-49e0d3f78097")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03da8e99-0ccf-11df-8525-001302895b2b");
            TILER_CONNECTOR_ORIGIN_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03da8e9b-0ccf-11df-8525-001302895b2b");
            TILER_CONNECTOR_PAVING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03da8e9d-0ccf-11df-8525-001302895b2b");
            TILER_CONNECTOR_FITTING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03da8e9f-0ccf-11df-8525-001302895b2b");
            TILER_CONNECTOR_TILER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03da8ea1-0ccf-11df-8525-001302895b2b");
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
