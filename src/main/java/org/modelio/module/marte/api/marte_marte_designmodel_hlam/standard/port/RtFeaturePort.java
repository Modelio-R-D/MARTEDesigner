/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.port;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
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
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Port} with << RtFeature_Port >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class RtFeaturePort {
    public static final String STEREOTYPE_NAME = "RtFeature_Port";

    public static final String RTFEATURE_PORT_SPECIFICATION_NOTETYPE = "RtFeature_Port_specification";

    /**
     * The underlying {@link Port} represented by this proxy, never null.
     */
    protected final Port elt;

    /**
     * Tells whether a {@link RtFeaturePort proxy} can be instantiated from a {@link MObject} checking it is a {@link Port} stereotyped << RtFeature_Port >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Port) && ((Port) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtFeaturePort.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Port} stereotyped << RtFeature_Port >> then instantiate a {@link RtFeaturePort} proxy.
     * 
     * @return a {@link RtFeaturePort} proxy on the created {@link Port}.
     */
    public static RtFeaturePort create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Port");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, RtFeaturePort.STEREOTYPE_NAME);
        return RtFeaturePort.instantiate((Port)e);
    }

    /**
     * Tries to instantiate a {@link RtFeaturePort} proxy from a {@link Port} stereotyped << RtFeature_Port >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Port
     * @return a {@link RtFeaturePort} proxy or <i>null</i>.
     */
    public static RtFeaturePort instantiate(final Port obj) {
        return RtFeaturePort.canInstantiate(obj) ? new RtFeaturePort(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RtFeaturePort} proxy from a {@link Port} stereotyped << RtFeature_Port >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Port}
     * @return a {@link RtFeaturePort} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static RtFeaturePort safeInstantiate(final Port obj) throws IllegalArgumentException {
        if (RtFeaturePort.canInstantiate(obj))
        	return new RtFeaturePort(obj);
        else
        	throw new IllegalArgumentException("RtFeaturePort: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        RtFeaturePort other = (RtFeaturePort) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Port}. 
     * @return the Port represented by this proxy, never null.
     */
    public Port getElement() {
        return this.elt;
    }

    /**
     * Getter for note 'RtFeature_Port_specification'
     * <p>Note description:
     * <br/><i></i></p>
     */
    public String getRtFeature_Port_specificationNote() {
        return this.elt.getNoteContent(RtFeaturePort.MdaTypes.RTFEATURE_PORT_SPECIFICATION_NOTETYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for note 'RtFeature_Port_specification'
     * <p>Note description:
     * <br/><i></i></p>
     */
    public void setRtFeature_Port_specificationNote(final String value) {
        this.elt.putNoteContent(RtFeaturePort.MdaTypes.RTFEATURE_PORT_SPECIFICATION_NOTETYPE_ELT, value);
    }

    protected RtFeaturePort(final Port elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static NoteType RTFEATURE_PORT_SPECIFICATION_NOTETYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "5cbde35f-11a6-11df-b398-0014222a9f79");
            RTFEATURE_PORT_SPECIFICATION_NOTETYPE_ELT = ctx.getModelingSession().findElementById(NoteType.class, "19675b43-9276-11e0-aeeb-0027103f347c");
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
