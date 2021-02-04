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
 * Proxy class to handle a {@link Operation} with << Release_Operation >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("7f679249-6a8e-4124-a504-a4647fded63e")
public class ReleaseOperation extends GrServiceOperation {
    @objid ("6fb37c71-2c4b-4b15-9054-7ecb1399204b")
    public static final String STEREOTYPE_NAME = "Release_Operation";

    /**
     * Tells whether a {@link ReleaseOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link Operation} stereotyped << Release_Operation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("75c26033-82f0-41d0-a3f6-d35354e97bc0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Operation) && ((Operation) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ReleaseOperation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Operation} stereotyped << Release_Operation >> then instantiate a {@link ReleaseOperation} proxy.
     * 
     * @return a {@link ReleaseOperation} proxy on the created {@link Operation}.
     */
    @objid ("e6d20615-e2ca-41a5-8aeb-c07bd7f807a9")
    public static ReleaseOperation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Operation");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ReleaseOperation.STEREOTYPE_NAME);
        return ReleaseOperation.instantiate((Operation)e);
    }

    /**
     * Tries to instantiate a {@link ReleaseOperation} proxy from a {@link Operation} stereotyped << Release_Operation >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Operation
     * @return a {@link ReleaseOperation} proxy or <i>null</i>.
     */
    @objid ("17ce5c3f-86bb-4c61-b69f-e5ff7b800035")
    public static ReleaseOperation instantiate(final Operation obj) {
        return ReleaseOperation.canInstantiate(obj) ? new ReleaseOperation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ReleaseOperation} proxy from a {@link Operation} stereotyped << Release_Operation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Operation}
     * @return a {@link ReleaseOperation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4c60e9e3-535c-4f43-a7b3-b74c2e7ebe7b")
    public static ReleaseOperation safeInstantiate(final Operation obj) throws IllegalArgumentException {
        if (ReleaseOperation.canInstantiate(obj))
        	return new ReleaseOperation(obj);
        else
        	throw new IllegalArgumentException("ReleaseOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9020eec3-c929-4229-8f7c-6a54dbf7f2e4")
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
        ReleaseOperation other = (ReleaseOperation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Operation}. 
     * @return the Operation represented by this proxy, never null.
     */
    @objid ("34ee0635-0204-4dd3-b400-4f16e856e522")
    @Override
    public Operation getElement() {
        return (Operation)super.getElement();
    }

    @objid ("1a30e3b5-ead1-4cbf-bc33-291ceddd5fdd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("ff3aa453-8963-45a7-9336-11a37dd683fe")
    protected ReleaseOperation(final Operation elt) {
        super(elt);
    }

    @objid ("d2c4b653-bba5-42e7-9b5a-0a6500480437")
    public static final class MdaTypes {
        @objid ("43477e4f-b3cd-4c78-8086-d5c71e293c11")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b0cd2033-a305-4584-b4dc-2a42059da894")
        private static Stereotype MDAASSOCDEP;

        @objid ("cce69187-d3c9-4e1a-bb9b-fd454208bf24")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b040d1d3-5a89-4361-bd6a-71172392cee4")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b1b05a9c-14bf-11df-92f7-001302895b2b");
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
