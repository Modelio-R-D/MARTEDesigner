/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_annexes_rsm.standard.connectorend;

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
import org.modelio.metamodel.uml.statik.ConnectorEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ConnectorEnd} with << Tiler_ConnectorEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("32798c7a-c0ca-4f94-88cd-65878aff7265")
public class TilerConnectorEnd {
    @objid ("387d1035-84db-4fdb-bdb4-1302d5efd11f")
    public static final String STEREOTYPE_NAME = "Tiler_ConnectorEnd";

    @objid ("7e5ff52c-0c3d-434e-9264-652501569fce")
    public static final String TILER_CONNECTOREND_FITTING_TAGTYPE = "Tiler_ConnectorEnd_fitting";

    @objid ("65c182fc-30c1-4eab-974d-c3af721e0aaf")
    public static final String TILER_CONNECTOREND_ORIGIN_TAGTYPE = "Tiler_ConnectorEnd_origin";

    @objid ("63f46843-049f-423a-a2af-0c252343c55f")
    public static final String TILER_CONNECTOREND_PAVING_TAGTYPE = "Tiler_ConnectorEnd_paving";

    @objid ("3c5edf5a-6c30-42bb-85d4-890f4fe9911f")
    public static final String TILER_CONNECTOREND_TILER_TAGTYPE = "Tiler_ConnectorEnd_tiler";

    /**
     * The underlying {@link ConnectorEnd} represented by this proxy, never null.
     */
    @objid ("2f84cdbb-d399-4c35-bfb1-66e9fad6d7e3")
    protected final ConnectorEnd elt;

    /**
     * Tells whether a {@link TilerConnectorEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link ConnectorEnd} stereotyped << Tiler_ConnectorEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("f4ffb790-75b9-44a5-9d35-f8a1d31d7e13")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ConnectorEnd) && ((ConnectorEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TilerConnectorEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ConnectorEnd} stereotyped << Tiler_ConnectorEnd >> then instantiate a {@link TilerConnectorEnd} proxy.
     * 
     * @return a {@link TilerConnectorEnd} proxy on the created {@link ConnectorEnd}.
     */
    @objid ("08f461e3-dd60-4920-b354-19ffa1536e47")
    public static TilerConnectorEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("ConnectorEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TilerConnectorEnd.STEREOTYPE_NAME);
        return TilerConnectorEnd.instantiate((ConnectorEnd)e);
    }

    /**
     * Tries to instantiate a {@link TilerConnectorEnd} proxy from a {@link ConnectorEnd} stereotyped << Tiler_ConnectorEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ConnectorEnd
     * @return a {@link TilerConnectorEnd} proxy or <i>null</i>.
     */
    @objid ("6d4c58b9-15d6-480f-b7c6-c4e85f54b1e4")
    public static TilerConnectorEnd instantiate(final ConnectorEnd obj) {
        return TilerConnectorEnd.canInstantiate(obj) ? new TilerConnectorEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TilerConnectorEnd} proxy from a {@link ConnectorEnd} stereotyped << Tiler_ConnectorEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ConnectorEnd}
     * @return a {@link TilerConnectorEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("276c586c-9cf7-47d9-8e92-a1ae60fba615")
    public static TilerConnectorEnd safeInstantiate(final ConnectorEnd obj) throws IllegalArgumentException {
        if (TilerConnectorEnd.canInstantiate(obj))
        	return new TilerConnectorEnd(obj);
        else
        	throw new IllegalArgumentException("TilerConnectorEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ff0c69b6-d8a0-498e-b6f4-a4e3929371db")
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
        TilerConnectorEnd other = (TilerConnectorEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ConnectorEnd}. 
     * @return the ConnectorEnd represented by this proxy, never null.
     */
    @objid ("399e6f39-56a0-4973-a2c5-3c35e0840a8c")
    public ConnectorEnd getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Tiler_ConnectorEnd_fitting'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("958d875b-6b4a-464d-a6da-b1f7a1a0aa3d")
    public String getTiler_ConnectorEnd_fitting() {
        return this.elt.getTagValue(TilerConnectorEnd.MdaTypes.TILER_CONNECTOREND_FITTING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Tiler_ConnectorEnd_origin'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("21fb445d-6a2e-441c-a34f-5e6aa7816b0a")
    public String getTiler_ConnectorEnd_origin() {
        return this.elt.getTagValue(TilerConnectorEnd.MdaTypes.TILER_CONNECTOREND_ORIGIN_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Tiler_ConnectorEnd_paving'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e3ab3530-aa45-43f2-975f-ba65d380af32")
    public String getTiler_ConnectorEnd_paving() {
        return this.elt.getTagValue(TilerConnectorEnd.MdaTypes.TILER_CONNECTOREND_PAVING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Tiler_ConnectorEnd_tiler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b8f0023e-9e08-454b-ae33-be97305c0c2c")
    public String getTiler_ConnectorEnd_tiler() {
        return this.elt.getTagValue(TilerConnectorEnd.MdaTypes.TILER_CONNECTOREND_TILER_TAGTYPE_ELT);
    }

    @objid ("9dbfd808-5e37-461e-95a7-d40f7b630bd3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Tiler_ConnectorEnd_fitting'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("91dec92f-84d8-4896-ba6f-a082bb1a8d48")
    public void setTiler_ConnectorEnd_fitting(final String value) {
        this.elt.putTagValue(TilerConnectorEnd.MdaTypes.TILER_CONNECTOREND_FITTING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Tiler_ConnectorEnd_origin'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3aff8634-33a2-49d6-9d72-c121d96d6d38")
    public void setTiler_ConnectorEnd_origin(final String value) {
        this.elt.putTagValue(TilerConnectorEnd.MdaTypes.TILER_CONNECTOREND_ORIGIN_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Tiler_ConnectorEnd_paving'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("66c4c441-2cf3-4d21-a4e5-4c4580b284ae")
    public void setTiler_ConnectorEnd_paving(final String value) {
        this.elt.putTagValue(TilerConnectorEnd.MdaTypes.TILER_CONNECTOREND_PAVING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Tiler_ConnectorEnd_tiler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bc08a244-9c76-41b9-8613-113f1cdb512f")
    public void setTiler_ConnectorEnd_tiler(final String value) {
        this.elt.putTagValue(TilerConnectorEnd.MdaTypes.TILER_CONNECTOREND_TILER_TAGTYPE_ELT, value);
    }

    @objid ("cb60ea02-2925-4c3f-9dd9-d4c783ef0675")
    protected TilerConnectorEnd(final ConnectorEnd elt) {
        this.elt = elt;
    }

    @objid ("5d6975cc-7c0f-40ff-9c43-a0412a3771e4")
    public static final class MdaTypes {
        @objid ("875a2a07-b2bc-4c0e-b8b9-c8c1acf8794b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7546965f-85e0-4010-8991-f7ff9d794adc")
        public static TagType TILER_CONNECTOREND_ORIGIN_TAGTYPE_ELT;

        @objid ("45fa2250-caa8-49c0-b698-cfad2ee33599")
        public static TagType TILER_CONNECTOREND_PAVING_TAGTYPE_ELT;

        @objid ("82ee7c78-ea41-4d7c-b292-24c3c71154e0")
        public static TagType TILER_CONNECTOREND_FITTING_TAGTYPE_ELT;

        @objid ("9e998b0c-f07f-4361-89ae-853c4249ce29")
        public static TagType TILER_CONNECTOREND_TILER_TAGTYPE_ELT;

        @objid ("5ae3c4b2-fb8c-44eb-a8c0-b2482292f62b")
        private static Stereotype MDAASSOCDEP;

        @objid ("7a239fa7-2501-4eef-9d4d-8f7ede0cc830")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8db79e2c-a632-4860-8704-f1dfc96383e9")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03da8e98-0ccf-11df-8525-001302895b2b");
            TILER_CONNECTOREND_ORIGIN_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03da8e9a-0ccf-11df-8525-001302895b2b");
            TILER_CONNECTOREND_PAVING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03da8e9c-0ccf-11df-8525-001302895b2b");
            TILER_CONNECTOREND_FITTING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03da8e9e-0ccf-11df-8525-001302895b2b");
            TILER_CONNECTOREND_TILER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03da8ea0-0ccf-11df-8525-001302895b2b");
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
