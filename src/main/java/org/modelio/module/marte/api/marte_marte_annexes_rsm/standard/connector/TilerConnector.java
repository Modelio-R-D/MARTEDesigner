/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_annexes_rsm.standard.connector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
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
public class TilerConnector {
    public static final String STEREOTYPE_NAME = "Tiler_Connector";

    public static final String TILER_CONNECTOR_FITTING_TAGTYPE = "Tiler_Connector_fitting";

    public static final String TILER_CONNECTOR_ORIGIN_TAGTYPE = "Tiler_Connector_origin";

    public static final String TILER_CONNECTOR_PAVING_TAGTYPE = "Tiler_Connector_paving";

    public static final String TILER_CONNECTOR_TILER_TAGTYPE = "Tiler_Connector_tiler";

    /**
     * The underlying {@link Connector} represented by this proxy, never null.
     */
    protected final Connector elt;

    /**
     * Tells whether a {@link TilerConnector proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << Tiler_Connector >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TilerConnector.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Connector} stereotyped << Tiler_Connector >> then instantiate a {@link TilerConnector} proxy.
     * 
     * @return a {@link TilerConnector} proxy on the created {@link Connector}.
     */
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
    public static TilerConnector safeInstantiate(final Connector obj) throws IllegalArgumentException {
        if (TilerConnector.canInstantiate(obj))
        	return new TilerConnector(obj);
        else
        	throw new IllegalArgumentException("TilerConnector: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
    public Connector getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Tiler_Connector_fitting'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getTiler_Connector_fitting() {
        return this.elt.getTagValue(TilerConnector.MdaTypes.TILER_CONNECTOR_FITTING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Tiler_Connector_origin'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getTiler_Connector_origin() {
        return this.elt.getTagValue(TilerConnector.MdaTypes.TILER_CONNECTOR_ORIGIN_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Tiler_Connector_paving'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getTiler_Connector_paving() {
        return this.elt.getTagValue(TilerConnector.MdaTypes.TILER_CONNECTOR_PAVING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Tiler_Connector_tiler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getTiler_Connector_tiler() {
        return this.elt.getTagValue(TilerConnector.MdaTypes.TILER_CONNECTOR_TILER_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Tiler_Connector_fitting'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTiler_Connector_fitting(final String value) {
        this.elt.putTagValue(TilerConnector.MdaTypes.TILER_CONNECTOR_FITTING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Tiler_Connector_origin'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTiler_Connector_origin(final String value) {
        this.elt.putTagValue(TilerConnector.MdaTypes.TILER_CONNECTOR_ORIGIN_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Tiler_Connector_paving'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTiler_Connector_paving(final String value) {
        this.elt.putTagValue(TilerConnector.MdaTypes.TILER_CONNECTOR_PAVING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Tiler_Connector_tiler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTiler_Connector_tiler(final String value) {
        this.elt.putTagValue(TilerConnector.MdaTypes.TILER_CONNECTOR_TILER_TAGTYPE_ELT, value);
    }

    protected TilerConnector(final Connector elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType TILER_CONNECTOR_ORIGIN_TAGTYPE_ELT;

        public static TagType TILER_CONNECTOR_PAVING_TAGTYPE_ELT;

        public static TagType TILER_CONNECTOR_FITTING_TAGTYPE_ELT;

        public static TagType TILER_CONNECTOR_TILER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
