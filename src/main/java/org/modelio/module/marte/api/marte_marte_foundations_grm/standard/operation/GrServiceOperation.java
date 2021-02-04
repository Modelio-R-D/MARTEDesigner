/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.operation;

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
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Operation} with << GrService_Operation >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("308cfd8c-ba69-4ffa-a1fc-20e0bbff6942")
public class GrServiceOperation {
    @objid ("104c4dcc-2359-48d7-8f6d-3036edb9fbff")
    public static final String STEREOTYPE_NAME = "GrService_Operation";

    @objid ("9020a332-de1c-4822-8521-e2f5fd99cba6")
    public static final String GRSERVICE_OPERATION_OWNER_TAGTYPE = "GrService_Operation_owner";

    /**
     * The underlying {@link Operation} represented by this proxy, never null.
     */
    @objid ("b6118d19-4190-48ad-b3e6-d60558003720")
    protected final Operation elt;

    /**
     * Tells whether a {@link GrServiceOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link Operation} stereotyped << GrService_Operation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5eea039d-0cb9-4229-bc11-4d17d7f24109")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Operation) && ((Operation) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GrServiceOperation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Operation} stereotyped << GrService_Operation >> then instantiate a {@link GrServiceOperation} proxy.
     * 
     * @return a {@link GrServiceOperation} proxy on the created {@link Operation}.
     */
    @objid ("04786cc4-0221-40c2-9de7-29b682f83ca9")
    public static GrServiceOperation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Operation");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GrServiceOperation.STEREOTYPE_NAME);
        return GrServiceOperation.instantiate((Operation)e);
    }

    /**
     * Tries to instantiate a {@link GrServiceOperation} proxy from a {@link Operation} stereotyped << GrService_Operation >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Operation
     * @return a {@link GrServiceOperation} proxy or <i>null</i>.
     */
    @objid ("69cb63ad-4443-4dbb-88c6-98b10da2b6e4")
    public static GrServiceOperation instantiate(final Operation obj) {
        return GrServiceOperation.canInstantiate(obj) ? new GrServiceOperation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GrServiceOperation} proxy from a {@link Operation} stereotyped << GrService_Operation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Operation}
     * @return a {@link GrServiceOperation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e81455da-623e-4b30-ae4e-22ef66b54d72")
    public static GrServiceOperation safeInstantiate(final Operation obj) throws IllegalArgumentException {
        if (GrServiceOperation.canInstantiate(obj))
        	return new GrServiceOperation(obj);
        else
        	throw new IllegalArgumentException("GrServiceOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("85de7e27-e5e1-453f-8934-0d0d9c73033b")
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
        GrServiceOperation other = (GrServiceOperation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Operation}. 
     * @return the Operation represented by this proxy, never null.
     */
    @objid ("d197baae-5733-4ac5-8131-f4157e2c3f8d")
    public Operation getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'GrService_Operation_owner'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("53cb46e7-f2a4-4652-930b-21081dba0211")
    public String getGrService_Operation_owner() {
        return this.elt.getTagValue(GrServiceOperation.MdaTypes.GRSERVICE_OPERATION_OWNER_TAGTYPE_ELT);
    }

    @objid ("8e6143f2-d825-49f7-a8b6-23b3784d9c1f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GrService_Operation_owner'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f32b1ffe-c9d1-4cf3-96e4-3f6c2527b531")
    public void setGrService_Operation_owner(final String value) {
        this.elt.putTagValue(GrServiceOperation.MdaTypes.GRSERVICE_OPERATION_OWNER_TAGTYPE_ELT, value);
    }

    @objid ("01495cc2-6360-47b3-9de4-de5948445dfe")
    protected GrServiceOperation(final Operation elt) {
        this.elt = elt;
    }

    @objid ("b0580805-97b9-4274-8e91-43c7fd9e6ba3")
    public static final class MdaTypes {
        @objid ("98f79d99-71ff-4ab1-a763-1564c8422dd5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("27557ccc-f70d-403d-91f4-0f192a454f70")
        public static TagType GRSERVICE_OPERATION_OWNER_TAGTYPE_ELT;

        @objid ("2d98a987-8842-4213-a23b-dea2f4511bea")
        private static Stereotype MDAASSOCDEP;

        @objid ("19494a9c-96f7-424a-83ce-2cd44aa107af")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("37f1f9b3-a31b-444b-aefb-cce48a0e019c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ad278945-0f4a-11df-8c52-0014222a9f79");
            GRSERVICE_OPERATION_OWNER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "bd92db13-0f4a-11df-8c52-0014222a9f79");
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
