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
 * Proxy class to handle a {@link Connector} with << Reshape_Connector >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("37c7a3af-f7a0-43bd-ae1b-abe400855bd7")
public class ReshapeConnector extends LinkTopologyConnector {
    @objid ("7b197e59-3ccd-4042-ace3-b6fd1374da37")
    public static final String STEREOTYPE_NAME = "Reshape_Connector";

    @objid ("62153a00-3bef-41ec-8df7-08e86e91e955")
    public static final String RESHAPE_CONNECTOR_PATTERNSHAPE_TAGTYPE = "Reshape_Connector_patternShape";

    @objid ("69ffaa68-06bc-40fc-9c40-8d9b3f7bfc56")
    public static final String RESHAPE_CONNECTOR_REPETITONSHAPE_TAGTYPE = "Reshape_Connector_repetitonShape";

    /**
     * Tells whether a {@link ReshapeConnector proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << Reshape_Connector >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("36411f6b-bebd-456d-a3ed-3a957c186538")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ReshapeConnector.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Connector} stereotyped << Reshape_Connector >> then instantiate a {@link ReshapeConnector} proxy.
     * 
     * @return a {@link ReshapeConnector} proxy on the created {@link Connector}.
     */
    @objid ("6232af80-e61d-488c-b4bd-678e46ff7db7")
    public static ReshapeConnector create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Connector");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ReshapeConnector.STEREOTYPE_NAME);
        return ReshapeConnector.instantiate((Connector)e);
    }

    /**
     * Tries to instantiate a {@link ReshapeConnector} proxy from a {@link Connector} stereotyped << Reshape_Connector >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Connector
     * @return a {@link ReshapeConnector} proxy or <i>null</i>.
     */
    @objid ("db9edc3e-e9e4-492f-a101-83bd8fd65568")
    public static ReshapeConnector instantiate(final Connector obj) {
        return ReshapeConnector.canInstantiate(obj) ? new ReshapeConnector(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ReshapeConnector} proxy from a {@link Connector} stereotyped << Reshape_Connector >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Connector}
     * @return a {@link ReshapeConnector} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e991a189-f4d1-40c8-ac5e-69a02ce3b03b")
    public static ReshapeConnector safeInstantiate(final Connector obj) throws IllegalArgumentException {
        if (ReshapeConnector.canInstantiate(obj))
        	return new ReshapeConnector(obj);
        else
        	throw new IllegalArgumentException("ReshapeConnector: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("548eea70-79d7-485c-8db2-15dc2227d88e")
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
        ReshapeConnector other = (ReshapeConnector) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Connector}. 
     * @return the Connector represented by this proxy, never null.
     */
    @objid ("08e5ec66-2176-4fcd-99ee-ba5980c5f9c9")
    @Override
    public Connector getElement() {
        return (Connector)super.getElement();
    }

    /**
     * Getter for string property 'Reshape_Connector_patternShape'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e1230e2e-57de-47ae-a866-0ac21cf9adaa")
    public String getReshape_Connector_patternShape() {
        return this.elt.getTagValue(ReshapeConnector.MdaTypes.RESHAPE_CONNECTOR_PATTERNSHAPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Reshape_Connector_repetitonShape'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3fc5b735-d971-495b-842f-04474ab7e292")
    public String getReshape_Connector_repetitonShape() {
        return this.elt.getTagValue(ReshapeConnector.MdaTypes.RESHAPE_CONNECTOR_REPETITONSHAPE_TAGTYPE_ELT);
    }

    @objid ("68417535-d2de-4095-8e8a-376a15cbf6b4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Reshape_Connector_patternShape'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bf1ef11b-9bc2-465d-99f6-cfff850a780b")
    public void setReshape_Connector_patternShape(final String value) {
        this.elt.putTagValue(ReshapeConnector.MdaTypes.RESHAPE_CONNECTOR_PATTERNSHAPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Reshape_Connector_repetitonShape'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("703d3330-6cf8-49be-8a62-e524d100e43d")
    public void setReshape_Connector_repetitonShape(final String value) {
        this.elt.putTagValue(ReshapeConnector.MdaTypes.RESHAPE_CONNECTOR_REPETITONSHAPE_TAGTYPE_ELT, value);
    }

    @objid ("2194f29b-0735-4159-b68d-63c75b3aac3d")
    protected ReshapeConnector(final Connector elt) {
        super(elt);
    }

    @objid ("7a9098f8-5ad3-4839-86da-8a0cf7677377")
    public static final class MdaTypes {
        @objid ("7055b7a9-45a5-4201-bd56-6d2fc08110d5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a54be4cf-91c4-473a-be68-ffe9c25da913")
        public static TagType RESHAPE_CONNECTOR_PATTERNSHAPE_TAGTYPE_ELT;

        @objid ("adcb6d97-6964-4318-af7e-375006fdc042")
        public static TagType RESHAPE_CONNECTOR_REPETITONSHAPE_TAGTYPE_ELT;

        @objid ("10b05980-894c-4b43-b981-5b98316fa2cf")
        private static Stereotype MDAASSOCDEP;

        @objid ("3227cefd-8429-4fd0-aaab-542294ec5f8a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("050c7bfe-926f-4674-9991-35761337fcae")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03d5c9fe-0ccf-11df-8525-001302895b2b");
            RESHAPE_CONNECTOR_PATTERNSHAPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d5c9ff-0ccf-11df-8525-001302895b2b");
            RESHAPE_CONNECTOR_REPETITONSHAPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d5ca00-0ccf-11df-8525-001302895b2b");
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
