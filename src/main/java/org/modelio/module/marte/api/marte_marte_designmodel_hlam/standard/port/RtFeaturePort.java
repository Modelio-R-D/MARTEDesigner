/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.port;

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
@objid ("055f4b05-33e1-4a21-a65c-e3b210bcdab8")
public class RtFeaturePort {
    @objid ("dd0f2b51-99c2-47ff-9de5-60936d721659")
    public static final String STEREOTYPE_NAME = "RtFeature_Port";

    @objid ("ff92e740-0217-441f-b51c-7c66e0dcc73e")
    public static final String RTFEATURE_PORT_SPECIFICATION_NOTETYPE = "RtFeature_Port_specification";

    /**
     * The underlying {@link Port} represented by this proxy, never null.
     */
    @objid ("07083a97-35b7-41f8-aee2-84c43ae7c5c5")
    protected final Port elt;

    /**
     * Tells whether a {@link RtFeaturePort proxy} can be instantiated from a {@link MObject} checking it is a {@link Port} stereotyped << RtFeature_Port >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("4c5b6eb8-3d52-4402-8229-beece326b9ec")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Port) && ((Port) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtFeaturePort.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Port} stereotyped << RtFeature_Port >> then instantiate a {@link RtFeaturePort} proxy.
     * 
     * @return a {@link RtFeaturePort} proxy on the created {@link Port}.
     */
    @objid ("b7292857-9cab-4070-953e-cd0980997b55")
    public static RtFeaturePort create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Port");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, RtFeaturePort.STEREOTYPE_NAME);
        return RtFeaturePort.instantiate((Port)e);
    }

    /**
     * Tries to instantiate a {@link RtFeaturePort} proxy from a {@link Port} stereotyped << RtFeature_Port >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Port
     * @return a {@link RtFeaturePort} proxy or <i>null</i>.
     */
    @objid ("0151a7b9-fceb-4f13-9756-5ab419f2b0b2")
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
    @objid ("e1fab3fd-8208-459c-996e-792d71435971")
    public static RtFeaturePort safeInstantiate(final Port obj) throws IllegalArgumentException {
        if (RtFeaturePort.canInstantiate(obj))
        	return new RtFeaturePort(obj);
        else
        	throw new IllegalArgumentException("RtFeaturePort: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4d27d6b3-4051-437a-a0ab-48c559f13f91")
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
    @objid ("129a4c64-2b90-433b-8520-0399acbfa359")
    public Port getElement() {
        return this.elt;
    }

    /**
     * Getter for note 'RtFeature_Port_specification'
     * <p>Note description:
     * <br/><i></i></p>
     */
    @objid ("dd3dad96-bdc8-4b0e-9040-215d16773ffb")
    public String getRtFeature_Port_specificationNote() {
        return this.elt.getNoteContent(RtFeaturePort.MdaTypes.RTFEATURE_PORT_SPECIFICATION_NOTETYPE_ELT);
    }

    @objid ("8bed8d76-27b5-4774-b3d7-7c775b747ceb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for note 'RtFeature_Port_specification'
     * <p>Note description:
     * <br/><i></i></p>
     */
    @objid ("0c412f6f-61d7-43a0-bd9e-a11cca2ae845")
    public void setRtFeature_Port_specificationNote(final String value) {
        this.elt.putNoteContent(RtFeaturePort.MdaTypes.RTFEATURE_PORT_SPECIFICATION_NOTETYPE_ELT, value);
    }

    @objid ("babd6467-b921-41a5-b12f-6395878a0cb1")
    protected RtFeaturePort(final Port elt) {
        this.elt = elt;
    }

    @objid ("96b7c2ce-46c0-4d30-bac8-cc8061609a75")
    public static final class MdaTypes {
        @objid ("529eaceb-05a3-4e89-b97d-20a905a96ab0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7a8e0cbc-235b-4a1b-96a7-f90df3587f02")
        public static NoteType RTFEATURE_PORT_SPECIFICATION_NOTETYPE_ELT;

        @objid ("987784f9-6d77-4cd8-bbab-3b9c9d3c397c")
        private static Stereotype MDAASSOCDEP;

        @objid ("8eed6013-c29a-4cbe-8599-ae9f45296eac")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("81c1a235-fa69-425e-9435-e46524487da3")
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
