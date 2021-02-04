/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("6f585166-26f3-4b3b-bbce-b25fc7ecbbdb")
    public static final String STEREOTYPE_NAME = "Tiler_Connector";

    @objid ("15700e6a-f292-448b-b997-8981613f76ee")
    public static final String TILER_CONNECTOR_FITTING_TAGTYPE = "Tiler_Connector_fitting";

    @objid ("66c8209f-3a87-4f1d-be49-0e6a2c63fb64")
    public static final String TILER_CONNECTOR_ORIGIN_TAGTYPE = "Tiler_Connector_origin";

    @objid ("abbf1969-6baa-421c-b6dc-b86d6405e5af")
    public static final String TILER_CONNECTOR_PAVING_TAGTYPE = "Tiler_Connector_paving";

    @objid ("54120aab-c8d6-476e-8ed3-a8749ff1f30c")
    public static final String TILER_CONNECTOR_TILER_TAGTYPE = "Tiler_Connector_tiler";

    /**
     * The underlying {@link Connector} represented by this proxy, never null.
     */
    @objid ("2e12b02e-fee9-491a-9935-76eec7f4633a")
    protected final Connector elt;

    /**
     * Tells whether a {@link TilerConnector proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << Tiler_Connector >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7c845e6d-4625-4767-88ae-31e69c9d77c6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TilerConnector.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Connector} stereotyped << Tiler_Connector >> then instantiate a {@link TilerConnector} proxy.
     * 
     * @return a {@link TilerConnector} proxy on the created {@link Connector}.
     */
    @objid ("cf5c12ef-5822-44dc-81f4-0933019005a7")
    public static TilerConnector create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Connector");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TilerConnector.STEREOTYPE_NAME);
        return TilerConnector.instantiate((Connector)e);
    }

    /**
     * Tries to instantiate a {@link TilerConnector} proxy from a {@link Connector} stereotyped << Tiler_Connector >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Connector
     * @return a {@link TilerConnector} proxy or <i>null</i>.
     */
    @objid ("e2ff0291-fa4d-43a5-8930-ee4cc5155e5d")
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
    @objid ("14209971-7a60-4418-9b9d-f8da8497ec61")
    public static TilerConnector safeInstantiate(final Connector obj) throws IllegalArgumentException {
        if (TilerConnector.canInstantiate(obj))
        	return new TilerConnector(obj);
        else
        	throw new IllegalArgumentException("TilerConnector: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("abea3831-ebb5-41b0-8b80-f9a4f30f6982")
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
    @objid ("505e946d-e3e7-43f6-bc1b-476d1d5b8fe4")
    public Connector getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Tiler_Connector_fitting'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c07e2f46-2d03-49df-ab9c-4c1b4fd9b89b")
    public String getTiler_Connector_fitting() {
        return this.elt.getTagValue(TilerConnector.MdaTypes.TILER_CONNECTOR_FITTING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Tiler_Connector_origin'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("81956469-f7a1-4787-9579-a4642cbd199b")
    public String getTiler_Connector_origin() {
        return this.elt.getTagValue(TilerConnector.MdaTypes.TILER_CONNECTOR_ORIGIN_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Tiler_Connector_paving'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4e0bf6bf-6a77-40cd-8bd7-9588de52a8e3")
    public String getTiler_Connector_paving() {
        return this.elt.getTagValue(TilerConnector.MdaTypes.TILER_CONNECTOR_PAVING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Tiler_Connector_tiler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ecdbf097-5e3f-42dc-8c15-a2188d7cc80f")
    public String getTiler_Connector_tiler() {
        return this.elt.getTagValue(TilerConnector.MdaTypes.TILER_CONNECTOR_TILER_TAGTYPE_ELT);
    }

    @objid ("733d6a60-c9cb-466a-b698-562e5de553ea")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Tiler_Connector_fitting'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8d7edb59-f162-46b0-a769-38321f35d2c7")
    public void setTiler_Connector_fitting(final String value) {
        this.elt.putTagValue(TilerConnector.MdaTypes.TILER_CONNECTOR_FITTING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Tiler_Connector_origin'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bb0be4e6-7b9e-45a7-9a9b-d6f246a1be6d")
    public void setTiler_Connector_origin(final String value) {
        this.elt.putTagValue(TilerConnector.MdaTypes.TILER_CONNECTOR_ORIGIN_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Tiler_Connector_paving'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("30c59168-e74d-457f-ad09-ed3f0fc85f5b")
    public void setTiler_Connector_paving(final String value) {
        this.elt.putTagValue(TilerConnector.MdaTypes.TILER_CONNECTOR_PAVING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Tiler_Connector_tiler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b13a2590-012d-496e-9657-c5c798b8d914")
    public void setTiler_Connector_tiler(final String value) {
        this.elt.putTagValue(TilerConnector.MdaTypes.TILER_CONNECTOR_TILER_TAGTYPE_ELT, value);
    }

    @objid ("9ca31d82-ac95-4481-944c-f89579f68430")
    protected TilerConnector(final Connector elt) {
        this.elt = elt;
    }

    @objid ("0e2180e5-2897-496f-abde-5d41e2ac991e")
    public static final class MdaTypes {
        @objid ("504cf53b-0f0b-4aee-9e84-cf41f24597d6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b31c020f-bc1b-4053-a6ed-eb76a544ad2a")
        public static TagType TILER_CONNECTOR_ORIGIN_TAGTYPE_ELT;

        @objid ("16c83563-37e8-4062-9a01-320b3567c66f")
        public static TagType TILER_CONNECTOR_PAVING_TAGTYPE_ELT;

        @objid ("a0efa3e5-4af8-4aca-84e0-20a730e0aa08")
        public static TagType TILER_CONNECTOR_FITTING_TAGTYPE_ELT;

        @objid ("ab04ad1c-cf65-4f78-965b-e40cce2fc776")
        public static TagType TILER_CONNECTOR_TILER_TAGTYPE_ELT;

        @objid ("6625ab0a-883f-492f-9951-bb0652b17a41")
        private static Stereotype MDAASSOCDEP;

        @objid ("ceb67d21-a59b-4374-b3e4-9d813b890471")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("135ecc05-e214-47a0-9ba7-1916e65f0a13")
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
