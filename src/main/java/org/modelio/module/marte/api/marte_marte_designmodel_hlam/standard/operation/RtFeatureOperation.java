/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.operation;

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
import org.modelio.metamodel.uml.infrastructure.NoteType;
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
 * Proxy class to handle a {@link Operation} with << RtFeature_Operation >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("09f72ceb-9d41-4382-af38-bfc49b8e506c")
public class RtFeatureOperation {
    @objid ("462eb487-9c90-4fdb-b28b-d5e9adf599d0")
    public static final String STEREOTYPE_NAME = "RtFeature_Operation";

    @objid ("0fcb406d-d214-406f-b3de-76132361babd")
    public static final String RTFEATURE_OPERATION_SPECIFICATION_NOTETYPE = "RtFeature_Operation_specification";

    /**
     * The underlying {@link Operation} represented by this proxy, never null.
     */
    @objid ("cc7277e8-fafc-43c5-845a-fad9a18ee1b8")
    protected final Operation elt;

    /**
     * Tells whether a {@link RtFeatureOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link Operation} stereotyped << RtFeature_Operation >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b5bca11a-95ae-4c88-b496-e6f06b86ce10")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Operation) && ((Operation) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtFeatureOperation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Operation} stereotyped << RtFeature_Operation >> then instantiate a {@link RtFeatureOperation} proxy.
     * 
     * @return a {@link RtFeatureOperation} proxy on the created {@link Operation}.
     */
    @objid ("3d372600-dab1-4f24-b7d6-ab3d0958cb63")
    public static RtFeatureOperation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Operation");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, RtFeatureOperation.STEREOTYPE_NAME);
        return RtFeatureOperation.instantiate((Operation)e);
    }

    /**
     * Tries to instantiate a {@link RtFeatureOperation} proxy from a {@link Operation} stereotyped << RtFeature_Operation >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Operation
     * @return a {@link RtFeatureOperation} proxy or <i>null</i>.
     */
    @objid ("95974234-0b2d-4b47-8349-d22d4df6b831")
    public static RtFeatureOperation instantiate(final Operation obj) {
        return RtFeatureOperation.canInstantiate(obj) ? new RtFeatureOperation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RtFeatureOperation} proxy from a {@link Operation} stereotyped << RtFeature_Operation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Operation}
     * @return a {@link RtFeatureOperation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("83985977-421f-4720-bd31-e946039e0bb6")
    public static RtFeatureOperation safeInstantiate(final Operation obj) throws IllegalArgumentException {
        if (RtFeatureOperation.canInstantiate(obj))
        	return new RtFeatureOperation(obj);
        else
        	throw new IllegalArgumentException("RtFeatureOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6c1865a5-80f1-4273-bfae-287e9bdffa5b")
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
        RtFeatureOperation other = (RtFeatureOperation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Operation}. 
     * @return the Operation represented by this proxy, never null.
     */
    @objid ("d3b92db2-ebbd-4e82-8114-be2d37d07e85")
    public Operation getElement() {
        return this.elt;
    }

    /**
     * Getter for note 'RtFeature_Operation_specification'
     * <p>Note description:
     * <br/><i></i></p>
     */
    @objid ("b0b69e15-b90c-47df-879c-0f6766b120c6")
    public String getRtFeature_Operation_specificationNote() {
        return this.elt.getNoteContent(RtFeatureOperation.MdaTypes.RTFEATURE_OPERATION_SPECIFICATION_NOTETYPE_ELT);
    }

    @objid ("bb1e06e5-fd25-4bf2-bcfd-001db2664fe7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for note 'RtFeature_Operation_specification'
     * <p>Note description:
     * <br/><i></i></p>
     */
    @objid ("3f8ddd53-51f0-4d3f-85de-548f3e8a9b73")
    public void setRtFeature_Operation_specificationNote(final String value) {
        this.elt.putNoteContent(RtFeatureOperation.MdaTypes.RTFEATURE_OPERATION_SPECIFICATION_NOTETYPE_ELT, value);
    }

    @objid ("82124334-0400-4e33-ad52-5e4c32f9b745")
    protected RtFeatureOperation(final Operation elt) {
        this.elt = elt;
    }

    @objid ("e2c97ee9-84e3-4605-9292-b92c51d1d0c2")
    public static final class MdaTypes {
        @objid ("bba67879-5a48-4099-8054-54bf92c91013")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f006c6b5-7074-452f-a501-13c27b08c4d7")
        public static NoteType RTFEATURE_OPERATION_SPECIFICATION_NOTETYPE_ELT;

        @objid ("b5308548-bd74-4b82-ab45-0b5bea49c44b")
        private static Stereotype MDAASSOCDEP;

        @objid ("cb532039-ff02-4ce0-936c-5886d101bd7c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("38896fd6-9c13-4c61-a471-7b7183090025")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00c7d0e4-0ccf-11df-8525-001302895b2b");
            RTFEATURE_OPERATION_SPECIFICATION_NOTETYPE_ELT = ctx.getModelingSession().findElementById(NoteType.class, "18a4d45f-9276-11e0-aeeb-0027103f347c");
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
