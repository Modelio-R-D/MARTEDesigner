/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_annexes_rsm.standard.connectorend;

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
public class TilerConnectorEnd {
    public static final String STEREOTYPE_NAME = "Tiler_ConnectorEnd";

    public static final String TILER_CONNECTOREND_FITTING_TAGTYPE = "Tiler_ConnectorEnd_fitting";

    public static final String TILER_CONNECTOREND_ORIGIN_TAGTYPE = "Tiler_ConnectorEnd_origin";

    public static final String TILER_CONNECTOREND_PAVING_TAGTYPE = "Tiler_ConnectorEnd_paving";

    public static final String TILER_CONNECTOREND_TILER_TAGTYPE = "Tiler_ConnectorEnd_tiler";

    /**
     * The underlying {@link ConnectorEnd} represented by this proxy, never null.
     */
    protected final ConnectorEnd elt;

    /**
     * Tells whether a {@link TilerConnectorEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link ConnectorEnd} stereotyped << Tiler_ConnectorEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ConnectorEnd) && ((ConnectorEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TilerConnectorEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ConnectorEnd} stereotyped << Tiler_ConnectorEnd >> then instantiate a {@link TilerConnectorEnd} proxy.
     * 
     * @return a {@link TilerConnectorEnd} proxy on the created {@link ConnectorEnd}.
     */
    public static TilerConnectorEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ConnectorEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TilerConnectorEnd.STEREOTYPE_NAME);
        return TilerConnectorEnd.instantiate((ConnectorEnd)e);
    }

    /**
     * Tries to instantiate a {@link TilerConnectorEnd} proxy from a {@link ConnectorEnd} stereotyped << Tiler_ConnectorEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ConnectorEnd
     * @return a {@link TilerConnectorEnd} proxy or <i>null</i>.
     */
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
    public static TilerConnectorEnd safeInstantiate(final ConnectorEnd obj) throws IllegalArgumentException {
        if (TilerConnectorEnd.canInstantiate(obj))
        	return new TilerConnectorEnd(obj);
        else
        	throw new IllegalArgumentException("TilerConnectorEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        TilerConnectorEnd other = (TilerConnectorEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ConnectorEnd}. 
     * @return the ConnectorEnd represented by this proxy, never null.
     */
    public ConnectorEnd getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Tiler_ConnectorEnd_fitting'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getTiler_ConnectorEnd_fitting() {
        return this.elt.getTagValue(TilerConnectorEnd.MdaTypes.TILER_CONNECTOREND_FITTING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Tiler_ConnectorEnd_origin'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getTiler_ConnectorEnd_origin() {
        return this.elt.getTagValue(TilerConnectorEnd.MdaTypes.TILER_CONNECTOREND_ORIGIN_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Tiler_ConnectorEnd_paving'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getTiler_ConnectorEnd_paving() {
        return this.elt.getTagValue(TilerConnectorEnd.MdaTypes.TILER_CONNECTOREND_PAVING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Tiler_ConnectorEnd_tiler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getTiler_ConnectorEnd_tiler() {
        return this.elt.getTagValue(TilerConnectorEnd.MdaTypes.TILER_CONNECTOREND_TILER_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Tiler_ConnectorEnd_fitting'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTiler_ConnectorEnd_fitting(final String value) {
        this.elt.putTagValue(TilerConnectorEnd.MdaTypes.TILER_CONNECTOREND_FITTING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Tiler_ConnectorEnd_origin'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTiler_ConnectorEnd_origin(final String value) {
        this.elt.putTagValue(TilerConnectorEnd.MdaTypes.TILER_CONNECTOREND_ORIGIN_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Tiler_ConnectorEnd_paving'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTiler_ConnectorEnd_paving(final String value) {
        this.elt.putTagValue(TilerConnectorEnd.MdaTypes.TILER_CONNECTOREND_PAVING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Tiler_ConnectorEnd_tiler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTiler_ConnectorEnd_tiler(final String value) {
        this.elt.putTagValue(TilerConnectorEnd.MdaTypes.TILER_CONNECTOREND_TILER_TAGTYPE_ELT, value);
    }

    protected TilerConnectorEnd(final ConnectorEnd elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType TILER_CONNECTOREND_ORIGIN_TAGTYPE_ELT;

        public static TagType TILER_CONNECTOREND_PAVING_TAGTYPE_ELT;

        public static TagType TILER_CONNECTOREND_FITTING_TAGTYPE_ELT;

        public static TagType TILER_CONNECTOREND_TILER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
